package com.qa.main;

public class Runner
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Coins customer = new Coins();
		double customersMoney = 20.00;
		double itemPrice = 04.58;
		
		customer.calculateCustomersChange(customersMoney, itemPrice);

	}

}
