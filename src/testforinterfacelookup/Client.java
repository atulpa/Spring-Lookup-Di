package testforinterfacelookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Truck;

public class Client {

	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("test/engine.xml");
		
		   System.out.println("------Car-------------");
		   Car c=(Car) context.getBean("c");
		    // what internlly happaning as follow
		    System.out.println(c.getClass().getCanonicalName());//beans.Car$$EnhancerBySpringCGLIB$$7abebda4
		    // this child class for car interface generated at run time
		    System.out.println(c.MyCarEngine().getName());
		    //car interface object gives engine impemantation along with methods of engine (getName()
		    System.out.println("------bus-------------");
		    Bus b=(Bus) context.getBean("b");
		    System.out.println(b.getClass().getCanonicalName());
		    System.out.println(b.MyBusEngine().getName());
		    System.out.println("------Truck-------------");
		    Truck t=(Truck) context.getBean("t");
		    System.out.println(t.getClass().getCanonicalName());
		    System.out.println(t.MyTrcukEngine().getName());

	}
}
