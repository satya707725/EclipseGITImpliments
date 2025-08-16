package com.satya.main;

public class App {
	
	public int doSum(int num1,int num2) {
		return num1+num2;
	}
    public static void main(String[] args) {
    	App a = new App();
        System.out.println("Sum amount is :: "+a.doSum(100, 200));
    }
}
