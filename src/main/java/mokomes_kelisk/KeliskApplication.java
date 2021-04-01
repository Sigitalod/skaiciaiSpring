package mokomes_kelisk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class KeliskApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(KeliskApplication.class, args);
		/*ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
		SkaiciavimoUzduotis su = (SkaiciavimoUzduotis) context.getBean( "mainspring" );
		su.vykdyti();*/
	}

}
