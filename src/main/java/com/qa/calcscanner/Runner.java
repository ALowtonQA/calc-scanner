package com.qa.calcscanner;

public class Runner {
	
	public static void main(String[] args) {
		Input input = new Input();
		CalculatorScanner calc = new CalculatorScanner();
		Menu start = new Menu(input, calc); 
		
		start.menu();	
	}
	
}
