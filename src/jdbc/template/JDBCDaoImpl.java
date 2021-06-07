package jdbc.template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("MY")
public class JDBCDaoImpl {
	
  
	@Autowired
	DataSource datasource;
	JdbcTemplate j=new JdbcTemplate();
	public int getCircleByid() {
		
		String sql = "SELECT COUNT(*) FROM CIRCLE ";
		j.setDataSource(datasource);
			
		int count=j.queryForObject(sql, null, Integer.class);
		
		return count;

	}
}
