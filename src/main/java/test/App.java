package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("test/beans/beans.xml");
		Venit venit = (Venit) context.getBean("venit");
		Cheltuiala cheltuiala = (Cheltuiala) context.getBean("cheltuiala");
		Profit profit = (Profit) context.getBean("profit");
		
		System.out.println(venit);
		System.out.println(cheltuiala);
		System.out.println(profit);
		System.out.println("Profitul este de: " + profit.getProfit() + " lei");

		((ClassPathXmlApplicationContext) context).close();
	}

}
