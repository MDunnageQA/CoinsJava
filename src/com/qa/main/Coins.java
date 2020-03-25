package com.qa.main;

public class Coins 
{
	public  void calculateCustomersChange(double customersMoney, double itemPrice)
	{
		int twentyPoundNoteCount = 0;
		int tenPoundNoteCount = 0;
		int fivePoundNoteCount = 0;
		int twoPoundCoinCount = 0;
		int onePoundCoinCount = 0;
		int fiftyPenceCoinCount = 0;
		int twentyPenceCoinCount = 0;
		int tenPenceCoinCount = 0;
		int fivePenceCoinCount = 0;
		int twoPenceCoinCount = 0;
		int onePenceCoinCount = 0;
		
		customersMoney = customersMoney - itemPrice;
		
		 while (customersMoney >= 00.01)
		{
			 while (customersMoney >= 00.02)
			 {
				 while (customersMoney >= 00.05)
				 {
					 while (customersMoney >= 00.10)
					 {
						 while (customersMoney >= 00.20)
						 {
							 while (customersMoney >= 00.50)
							 {
								 while (customersMoney >= 01.00)
								 {
									 while (customersMoney >= 02.00)
									 {
										 while (customersMoney >= 05.00)
										 {
											 while (customersMoney >= 10.00)
											 {
												 while (customersMoney >= 20.00)
												 {
													 customersMoney = customersMoney - 20.00;
													 twentyPoundNoteCount = twentyPoundNoteCount + 1;
												 }
												 if (customersMoney - 10.00 > -00.01) 
												 {
													 customersMoney = customersMoney - 10.00;
													 tenPoundNoteCount = tenPoundNoteCount + 1;
												 }
												
											 }
											 if (customersMoney - 05.00 > -00.01) 
											 {
												 customersMoney = customersMoney - 05.00;
												 fivePoundNoteCount = fivePoundNoteCount + 1;
											 }
										 }
										 if (customersMoney - 02.00 > -00.01) 
										 {
											customersMoney = customersMoney - 02.00;
											twoPoundCoinCount = twoPoundCoinCount + 1;
										 }
									 }
									 if (customersMoney - 01.00 > -00.01) 
									 {
									 	customersMoney = customersMoney - 01.00;
									 	onePoundCoinCount = onePoundCoinCount + 1;
									 }
								 }
								 if (customersMoney - 00.50 > -00.01) 
								 {
									 customersMoney = customersMoney - 00.50;
									 fiftyPenceCoinCount = fiftyPenceCoinCount + 1;
								 }
							 }
							 if (customersMoney - 00.20 > -00.01) 
							 {
								 customersMoney = customersMoney - 00.20;
								 twentyPenceCoinCount = twentyPenceCoinCount + 1;
							 }
							 
						 }
						 if (customersMoney - 00.10 > -00.01) 
						 {
							 customersMoney = customersMoney - 00.10;
							 tenPenceCoinCount = tenPenceCoinCount + 1;
						 }
					 }
					 if (customersMoney - 00.05 > -00.01) 
					 {
						 customersMoney = customersMoney - 00.05;
						 fivePenceCoinCount = fivePenceCoinCount + 1;
					 }
				 }
				 if (customersMoney - 00.02 > -00.01) 
				 {
					 customersMoney = customersMoney - 00.02;
					 twoPenceCoinCount = twoPenceCoinCount + 1;
				 }
			 }
			 if (customersMoney - 00.01 > -00.01) 
			 {
				 customersMoney = customersMoney - 00.01;
				 onePenceCoinCount = onePenceCoinCount + 1;
			 }
		}
		
		System.out.println("Your Change is: " + twentyPoundNoteCount + " £20 ," + 
		tenPoundNoteCount + " £10 ," + fivePoundNoteCount + " £5 ," + twoPoundCoinCount + " £2 ,"
		+ onePoundCoinCount + " £1 ," + fiftyPenceCoinCount + " 50p ," + twentyPenceCoinCount
		+ " 20p ," + tenPenceCoinCount + " 10p ," + fivePenceCoinCount + " 5p ," +
		twoPenceCoinCount + " 2p ," + onePenceCoinCount + " 1p ,");
	}
}
