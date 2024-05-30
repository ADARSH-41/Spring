package org.spring.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");

		System.out.println(
				"\nphase-1 completed---------------------------------------------------- Objects for the beans created  except for the beans with scope prototype and with lazy-init=true\n");

		Computer com = context.getBean(Computer.class);
		com.code();
		if (com instanceof Laptop)
			((Laptop) com).setBrand("DELL");
		else if (com instanceof Desktop)
			((Desktop) com).setBrand("Lenovo");

		System.out.println(
				"\nphase-2 completed---------------------------------------------------- Computer Ops completed\n");

		Alien alien1 = (Alien) context.getBean("alien");
		System.out.println(alien1.getAge());
		alien1.code();
		System.out.println(alien1);

		System.out.println(
				"\nphase-3 completed---------------------------------------------------- alien1 ops completed\n");

		Computer com2 = context.getBean("computer1", Computer.class);
		com2.code();
		com2.compile();
		System.out.println((com2 instanceof Laptop) ? ((Laptop) com2).getBrand() : ((Desktop) com2).getBrand());

		System.out.println(
				"\nphase-4 completed---------------------------------------------------- computer1(Laptop) Ops Completed\n");

		Alien alien2 = (Alien) context.getBean("alien");
		System.out.println(alien2.getAge());
		alien2.code();
		System.out.println(alien2);

		System.out.println(
				"\nphase-5 completed---------------------------------------------------- alien2 Ops Completed\n");

		Computer com3 = context.getBean("computer1", Computer.class);
		com3.code();
		com3.compile();
		System.out.println((com3 instanceof Laptop) ? ((Laptop) com3).getBrand() : ((Desktop) com3).getBrand());
	}
}
