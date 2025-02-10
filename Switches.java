package JavaProject.src.PRACTICE;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        
        // Enhanced switch = A replacement to many else if statements 
        //                   (Java14 feature)

        String day;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        day = scanner.nextLine();

        /*switch (day) {

            case "Monday" -> System.out.println("It is weekday 😒");

            case "Tuesday" -> System.out.println("It is weekday 😒");

            case "Wednesday" -> System.out.println("It is weekday 😒");

            case "Thursday" -> System.out.println("It is weekday 😒");

            case "Friday" -> System.out.println("It is weekday 😒");

            case "Saturday" -> System.out.println("It is the weekend 😊");

            case "Sunday" -> System.out.println("It is the weekend 😊");

            default -> System.out.println(day + " is not a day");

        }*/

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday" ->  
            System.out.println("It is weekday 😒");

            case "Saturday", "Sunday" ->
            System.out.println("It is the weekend 😊");

            default -> System.out.println(day + " is not a day");
        }
        scanner.close();
    }
}
