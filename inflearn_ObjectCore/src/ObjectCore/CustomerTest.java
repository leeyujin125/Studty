package ObjectCore;

public class CustomerTest {
	public static void main(String[] args) {
		
		int price = 10000;
		Customer Lee = new Customer(10010, "이동혁");
		Lee.bonusPoint = 1000;
		int cost = Lee.calcPrice(price);
		System.out.println(Lee.showCustomerInfo()+"\n지불 금액은 "+cost+"원 입니다.");
		
		VIPCustomer Kim = new VIPCustomer(10020, "김여주",12345);
		Kim.bonusPoint = 10000;
		cost = Kim.calcPrice(price);
		System.out.println(Kim.showCustomerInfo()+"\n지불 금액은 "+cost+"원 입니다.");
		
		Customer Park = new VIPCustomer(10011, "박지성",12345);
		cost = Park.calcPrice(price);
		System.out.println(Park.showCustomerInfo()+"\n지불 금액은 "+cost+"원 입니다.");
	}
}
