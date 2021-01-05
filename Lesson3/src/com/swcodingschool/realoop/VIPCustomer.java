package com.swcodingschool.realoop;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPcustomer 생성자 동작...");
	}
	
	
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		//return super.calcPrice(price);
		bonusPoint += price * bonusRatio;
		return price - price * (int)saleRatio;
	}



	public int getAgentID() {
		return agentID;
	}
	
}
