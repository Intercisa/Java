package main;

import sellstock.SellStock;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {7,1,5,3,6,4};
		
		SellStock stock = new SellStock();
		System.out.println(stock.maxProfit(arr));

	}

}
