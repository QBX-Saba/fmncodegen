package db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import play.db.jpa.*;

import dto.Code;

public class DataManager {
	
//	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
	private static DataManager instance;

	public static DataManager getInstance() {
		if (instance == null) {
			instance = new DataManager();
		}
		
		return instance;
	}

	public List<Code> list() throws Exception {
		List<Code> list = null;
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {  
			JPA.em().getEntityManagerFactory().getCache().evictAll();
			String query = "Select * from promotion_codes order by created_at DESC";
			//list = (entityManager.createQuery("FROM Code ORDER BY created_at DESC", Code.class)).getResultList();
			list = JPA.em().createNativeQuery(query, Code.class).getResultList();
//			JPA.em().close();
		} catch (Exception exp) {
			exp.printStackTrace();
			throw exp;
		}
//		} finally {
//			if (JPA.em() != null && JPA.em().isOpen()) {
//				JPA.em().close();
//			}
//		}

		return list;
	}

	public void save(Code code) throws Exception {

//		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			JPA.em().getEntityManagerFactory().getCache().evictAll();
			
			JPA.em().persist(code);

			
//			JPA.em().close();
		} catch (Exception exp) {
			exp.printStackTrace();
			throw exp;
		}
//		} finally {
//			if (JPA.em() != null && JPA.em().isOpen()) {
//				JPA.em().close();
//			}
//		}

	}

	public void assignCodes(String[] assigned) {

//		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			JPA.em().getEntityManagerFactory().getCache().evictAll();
			
			String codes = String.join("','", assigned);
			String stmt = "UPDATE promotion_codes set is_assigned=true WHERE code in ('"+codes+"')";
			JPA.em().createNativeQuery(stmt).executeUpdate();
			
//			JPA.em().close();
		} catch (Exception exp) {
			exp.printStackTrace();
			throw exp;
		}
//		} finally {
//			if (JPA.em() != null && JPA.em().isOpen()) {
//				JPA.em().close();
//			}
//		}

	}
}
