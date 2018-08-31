package step4.test;

import step4.PizzaService;
import step4.PotatoPizzaService;
import step4.SeaFoodPizzaService;

public class TestTemplateMethodDesignPattern {
	public static void main(String[] args) {
		PizzaService[] service = {new SeaFoodPizzaService(), 
				new PotatoPizzaService()};
		for(int i=0;i<service.length;i++) {
			service[i].makePizza();
			System.out.println("*******************");
		}
	}
}
