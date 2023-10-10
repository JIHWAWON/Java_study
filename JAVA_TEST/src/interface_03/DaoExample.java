package interface_03;

public class DaoExample {
	public static void dbWork(DataAccess dao) {
	dao.select();
	dao.insert();
	dao.update();
	dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
