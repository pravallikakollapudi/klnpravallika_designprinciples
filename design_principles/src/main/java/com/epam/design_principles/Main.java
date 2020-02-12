package com.epam.design_principles;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Calculator c=new Calculator();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber=s.nextInt();
        System.out.println("Enter second number:");
        int secondNumber=s.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter Your Option:");
        int option=s.nextInt();
        switch(option){
        case 1:c.addition(firstNumber, secondNumber);
                break;
        case 2:c.subtraction(firstNumber, secondNumber);
                break;
        case 3:c.multiplication(firstNumber, secondNumber);
                break;
        case 4:c.division(firstNumber, secondNumber);
                break;
        default:System.out.println("Invalid choice...");
        }
    }

}
