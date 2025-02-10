package JavaProject.src.PRACTICE;

import java.util.Scanner;

public class PythagorasTheoram {
    public static void main(String[] args) {
        
       //HYPOTENUS c = Math.sqrt(a^2, b^2)

       Scanner scanner = new Scanner(System.in);

       double A;
       double B;
       double C;

       System.out.println("Enter an input for A: ");
       A = scanner.nextDouble();

       System.out.println("Enter an input for B: ");
       B = scanner.nextDouble();

       C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));

       System.out.println("The Hypotenuse is " + C + "cm");


       scanner.close();
    }
}
