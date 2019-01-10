package factory;

import pool.Constant;

public class DatabaseFactory {
	public static Database createDatabase(String vender) {
		Database database = null;
		switch(vender) {
		case "oracle":
			database = new Oracle(Constant.ORACLE_DRIVER,
					Constant.ORACLE_URL,
					Constant.USERNAME,
					Constant.PASSWORD);
			break;
		}
		
		return database;
	}
}
