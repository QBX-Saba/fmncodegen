package controllers;

import java.util.List;
import play.db.jpa.*;
import java.util.Map;

import dto.Code;
import play.*;
import play.mvc.*;
import service.DataService;
import views.html.*;

public class Application extends Controller {
	private static DataService dataService = DataService.getInstance();

	public static Result index() {
		return ok("");
	}

	@Transactional
	public static Result generate() {
		response().setCookie("message", "");
		String type = request().getQueryString("type");

		if (type != null && type.equals("fulldiscount")) {
			type = "100";
		} else if (type != null && type.equals("discount75")) {
			type = "75";
		} else {
			String[] assigned = request().queryString().get("assigned");
			if (assigned != null) {
				dataService.assignCodes(assigned);
			} else {
				response().setCookie("message", "Choose a Type");
				return redirect("/codes");
			}
		}

		try {
			String generatedCode = dataService.saveCode(type);
			return redirect("/codes?gencode="+generatedCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ok();
	}

	@Transactional
	public static Result codes() {
		try {
			
			String generatedCode = request().getQueryString("gencode");
			List<Code> codes = dataService.listCodes();
			return ok(promocodes.render(codes, generatedCode));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ok();
	}

}
