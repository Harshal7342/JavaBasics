package JavaProject.src.PRACTICE;

import java.util.Scanner;

public class compoundInterestCalculator{
    public static void main(String[] args) {

       double principal;
       double rate;
       int timesCompounded;
       int years;
       double amount;

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the principal amount: ");
       principal = scanner.nextDouble();

       System.out.println("Enter the interest rate (in %):  ");
       rate = scanner.nextDouble() /100;

       System.out.println("Enter the no. of times compounded per year: ");
       timesCompounded = scanner.nextInt();

       System.out.println("Enter the no. of years: ");
       years = scanner.nextInt();

       amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

       System.out.printf("The amount after %d years is $%,.2f  ", years, amount);


       System.out.println("");
       scanner.close();


    }

       

}