package ObjectCore;

public class VIPCustomer extends Customer {

	private int agentId;
	double salesRatio;
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		
		super(customerId, customerName);
		customerGrade ="VIP";
		salesRatio = 0.05;
		bonusRatio = 0.1;
		this.agentId = agentId;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);	//salesRatio가 double이라서 int로 형변환
	}

	public int getAgentId() {
		return agentId;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "상담원 아이디는 " + agentId;
	}
	
}
