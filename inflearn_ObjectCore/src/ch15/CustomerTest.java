package ch15;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.sell();
		customer.buy();
		
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();		//buy말고는 쓸 수 없음
		
		Sell seller = customer;
		seller.sell();		//sell말고는 쓸 수 없음
		
		customer.order();
	}
}
