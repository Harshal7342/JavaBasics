package JavaProject.src.PRACTICE;

import java.util.Scanner;

public class printf {
    public static void main(String[] args) {
        
       //Circumference of circle: 2 * Math.PI * radius
       //area = Math.PI . Math.pow(radius, 2)
       //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3) 

       double radius;
       double area;
       double Circumference;
       double volume;

       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter an input for radius: ");
       radius = scanner.nextDouble();
       
       Circumference = 2 * Math.PI * radius; 
       area = Math.PI * Math.pow(radius, 2);
       volume = (4.0/ 3.0) * Math.PI * Math.pow(radius, 3);

       System.out.printf("The Circumference of circle is: %.3fcm\n" , Circumference);
       System.out.printf("The Area of circle is: %.3fcm^2\n" , area);
       System.out.printf("The Volume of circle is: %.3fcm^3\n" , volume);

       scanner.close();
    }
}
