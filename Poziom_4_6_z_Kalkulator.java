package com.kodilla.kalkulator;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.*;

class Calculator
{
	public int addAToB(int a, int b) {
		return a + b;
	}
	public int substractAFromB(int a, int b) {
		return a - b;
	}
	public int productAFromB(int a, int b) { return  a * b;}
	public int quotientAFromB(int a, int b) {return a / b;}
}
@SpringBootApplication
public class KalkulatorApplication {
	public static void main(String[] args) {
		Calculator simpleCalculator = new Calculator();
		int result = simpleCalculator.addAToB(10, 5);
		System.out.println(result);
		int result1 = simpleCalculator.substractAFromB(10, 5);
		System.out.println(result1);
		int result2 = simpleCalculator.productAFromB(10, 5);
		System.out.println(result2);
		int result3 = simpleCalculator.quotientAFromB(10, 5);
		System.out.println(result3);
	}
}