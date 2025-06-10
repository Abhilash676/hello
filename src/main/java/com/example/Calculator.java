package com.example;
import java.util.Scanner;

public class Calculator {

 public int add(int a, int b) { return a + b; }

 public int subtract(int a, int b) { return a - b; }

 public int multiply(int a, int b) { return a * b; }

 public double divide(int a, int b) {
     if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
     return (double) a / b;
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Calculator calc = new Calculator();

     System.out.println("Simple Calculator");
     System.out.print("Enter first number: ");
     int a = scanner.nextInt();

     System.out.print("Enter operation (+, -, *, /): ");
     char op = scanner.next().charAt(0);

     System.out.print("Enter second number: ");
     int b = scanner.nextInt();

     try {
         switch (op) {
             case '+':
                 System.out.println("Result: " + calc.add(a, b));
                 break;
             case '-':
                 System.out.println("Result: " + calc.subtract(a, b));
                 break;
             case '*':
                 System.out.println("Result: " + calc.multiply(a, b));
                 break;
             case '/':
                 System.out.println("Result: " + calc.divide(a, b));
                 break;
             default:
                 System.out.println("Invalid operator!");
         }
     } catch (ArithmeticException e) {
         System.out.println("Error: " + e.getMessage());
     }

     scanner.close();
}
}
