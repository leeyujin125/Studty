package Quiz_Coffee;

public class CoffeeTest {
	public static void main(String[] args) {
		
		Person personKim = new Person("kim", 10000);
		Person personLee = new Person("Lee", 20000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		personKim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		personLee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
	}
}
