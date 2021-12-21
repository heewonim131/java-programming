package ch04;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	public int getAgentID() {
		return agentID;
	}
	
	// 재정의 된 내용 없음
	@Override
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint + "입니다";
	}
}
