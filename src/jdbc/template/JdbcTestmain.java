package jdbc.template;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTestmain {

	public static void main(String[] args) {
	/*Circle out= new JDBCDaoImpl().getCircleByid(1);
	
	System.out.println(out.getName());*/
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Jbean.xml");
		JDBCDaoImpl i=context.getBean("MY",JDBCDaoImpl.class);
		
		System.out.println("Total record count-->>"+i.getCircleByid());
		
         context.close();
	}

}
