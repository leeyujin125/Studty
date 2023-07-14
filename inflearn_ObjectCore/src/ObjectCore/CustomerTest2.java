package ObjectCore;

import java.util.ArrayList;

public class CustomerTest2 {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer Lee = new Customer(10010, "이동혁");
		Customer Na = new Customer(10020, "나재민");
		Customer Hwang = new GoldCustomer(10030, "황인준");
		Customer Jen = new GoldCustomer(10040, "이제노");
		Customer Zhong = new VIPCustomer(10050, "종천러",12345);
		
		customerList.add(Lee);
		customerList.add(Na);
		customerList.add(Hwang);
		customerList.add(Jen);
		customerList.add(Zhong);
		
		System.out.println("===== 고객 정보 출력 =====");
		
		for( Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 "+cost +"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 "+customer.bonusPoint+"점 입니다.");
		}
	}
}
