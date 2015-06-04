package service;

import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;

import db.DataManager;
import dto.Code;

public class DataService {

	private static DataService instance;
	private static DataManager dataManager;

	public static DataService getInstance() {
		if (instance == null) {
			instance = new DataService();
			dataManager = DataManager.getInstance();
		}
		return instance;
	}

	public List<Code> listCodes() throws Exception {
		return dataManager.list();
	}

	public String saveCode(String type) throws Exception {
		if (type != null && !type.equals("")) {
			Code code = new Code();
			
			code.setCode(RandomStringUtils.randomAlphanumeric(4).toUpperCase()+RandomStringUtils.randomAlphanumeric(4).toUpperCase());
			code.setType(type);
			code.setCreatedAt(Calendar.getInstance().getTime());
			dataManager.save(code);
			return code.getCode();
		}
		return "";

	}

	public void assignCodes(String[] assigned) {
		dataManager.assignCodes(assigned);

	}

}
