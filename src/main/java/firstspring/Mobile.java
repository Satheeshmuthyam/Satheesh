package firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("firstbean.xml");
		Sim sim=(Sim) context.getBean("obj");
		sim.calling();
		sim.messaging();
	}

}

