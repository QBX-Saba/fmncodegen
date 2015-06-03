package db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.h2.tools.Csv;

import dto.Code;

public class DataManager {
	@PersistenceContext
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
	private static DataManager instance;

	public static DataManager getInstance() {
		if (instance == null) {
			instance = new DataManager();
		}
		return instance;
	}

	public List<Code> list() throws Exception {
		List<Code> list = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getEntityManagerFactory().getCache().evictAll();
			String query = "Select * from promotion_codes order by created_at DESC";
			//list = (entityManager.createQuery("FROM Code ORDER BY created_at DESC", Code.class)).getResultList();
			list = entityManager.createNativeQuery(query, Code.class).getResultList();
			entityManager.close();
		} catch (Exception exp) {
			exp.printStackTrace();
			throw exp;
		} finally {
			if (entityManager != null && entityManager.isOpen()) {
				entityManager.close();
			}
		}

		return list;
	}

	public void save(Code code) throws Exception {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getEntityManagerFactory().getCache().evictAll();
			entityManager.getTransaction().begin();
			entityManager.persist(code);

			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception exp) {
			exp.printStackTrace();
			throw exp;
		} finally {
			if (entityManager != null && entityManager.isOpen()) {
				entityManager.close();
			}
		}

	}

	public void assignCodes(String[] assigned) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getEntityManagerFactory().getCache().evictAll();
			entityManager.getTransaction().begin();
			String codes = String.join("','", assigned);
			String stmt = "UPDATE promotion_codes set is_assigned=true WHERE code in ('"+codes+"')";
			entityManager.createNativeQuery(stmt).executeUpdate();
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception exp) {
			exp.printStackTrace();
			throw exp;
		} finally {
			if (entityManager != null && entityManager.isOpen()) {
				entityManager.close();
			}
		}

	}
}
