package Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("MovieB.xml");
		SimpleMovieListener s= context.getBean("simple",SimpleMovieListener.class);
        s.ShowMovieFinder();
	}

}
