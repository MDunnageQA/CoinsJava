package com.qa.main;

public class Runner
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Coins customer = new Coins();
		double customersMoney = 10.00;
		double itemPrice = 01.74;
		
		customer.calculateCustomersChange(customersMoney, itemPrice);

	}

}
