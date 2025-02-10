package JavaProject.src.PRACTICE;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

// P.E.M.D.A.S


       //double result = 3 + 4 * (7 - 5) / 2.0;

       //System.out.println(result);


       //SHOPPING CART PROGRAM

       Scanner scanner = new Scanner(System.in);

       String item;
       double price;
       int quantity;
       char currency = '$';
       double total;

       System.out.println("What item would you like to buy? ");
       item = scanner.nextLine();

       System.out.println("What is the price of each? ");
       price = scanner.nextDouble();

       System.out.println("How many would you like? ");
       quantity = scanner.nextInt();

       total = price * quantity;
       System.out.println("Your total bill is " + total + currency );

       scanner.close();
    
    }

}