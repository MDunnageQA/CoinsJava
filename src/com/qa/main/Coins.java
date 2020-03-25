package com.qa.main;

public class Coins 
{
	public  void calculateCustomersChange(double customersMoney, double itemPrice)
	{
		int tenPoundNoteCount = 0;
		int fivePoundNoteCount = 0;
		int twentyPenceCoinCount = 0;
		int twoPenceCoinCount = 0;
		
		customersMoney = customersMoney - itemPrice;
		
		 while (customersMoney >= 00.01)
		{
			 while (customersMoney >= 00.20)
			 {
				 while (customersMoney >= 05.00)
				 {
					 while (customersMoney >= 10.00)
					 {
						 customersMoney = customersMoney - 10.00;
						 tenPoundNoteCount = tenPoundNoteCount + 1;
					 }
					 customersMoney = customersMoney - 05.00;
					 fivePoundNoteCount = fivePoundNoteCount + 1;
				 }
				 customersMoney = customersMoney - 00.20;
				 twentyPenceCoinCount = twentyPenceCoinCount + 1;
			 }
			 customersMoney = customersMoney - 00.02;
			 twoPenceCoinCount = twoPenceCoinCount + 1;
		}
		
		System.out.println("Your Change is: " + tenPoundNoteCount + " £10 " + 
		fivePoundNoteCount + " £5 " + twentyPenceCoinCount + " 20p "
		+ twoPenceCoinCount + " 2p ");
	}
}
