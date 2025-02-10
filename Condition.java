package JavaProject.src.PRACTICE;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;
        
        /*int hours;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your num: ");
        hours = scanner.nextInt();

        String timesOfDay = (hours > 12) ? "pm" : "am";

        System.out.println(timesOfDay);

        scanner.close();*/

        double temp;
        double newTemp;
        String unit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to celsius or Fehrenhite? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1f%s ",newTemp, unit);

        scanner.close();

    
    }
}
