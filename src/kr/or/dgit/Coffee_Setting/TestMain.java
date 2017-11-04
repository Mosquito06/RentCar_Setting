package kr.or.dgit.Coffee_Setting;

import java.sql.Connection;

import kr.or.dgit.Coffee_Setting.jdbc.DBCon;
import kr.or.dgit.Coffee_Setting.service.DbService;
import kr.or.dgit.Coffee_Setting.service.ExportService;

public class TestMain {

	public static void main(String[] args) {
		DBCon db = DBCon.getInstance();
		
		Connection connection = db.getConnection();
		System.out.println(connection);

		/*DbService service = InitService.getInstance();
		service.service();
		
		DbService service = ImportService.getInstance();
		service.service();
		
		DbService service = ExportService.getInstance();
		service.service();*/
	
		
		
	}

}
