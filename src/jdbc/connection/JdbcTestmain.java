package jdbc.connection;

public class JdbcTestmain {

	public static void main(String[] args) {
	Circle out= new JDBCDaoImpl().getCircleByid(1);
	
	System.out.println(out.getName());

	}

}
