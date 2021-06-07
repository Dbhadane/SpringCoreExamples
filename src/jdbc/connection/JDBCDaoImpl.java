package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDaoImpl {
	private static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/company?useSSL=false";
	//private static final String URL="jdbc:mysql://localhost/emp";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	public Circle getCircleByid(int inputCircleId) {
		Circle circle = null;
		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;

		try {
			Class.forName(JDBC_DRIVER);

			System.out.println("connecting to database.........");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Creating statement........");
			String sql = "SELECT * FROM CIRCLE WHERE ID = ?";
			
			stmt = connection.prepareStatement(sql);

			stmt.setInt(1, inputCircleId);

			resultSet = stmt.executeQuery();
			System.out.println(stmt.toString());

			while (resultSet.next()) {
				int id1 = resultSet.getInt("ID");
				String name = resultSet.getString("NAME");
				circle = new Circle(id1, name);

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {

			}
			try {
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Goodbye.........");
		return circle;

	}
}
