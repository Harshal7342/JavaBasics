package JavaProject.src.PRACTICE;
import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        
        // WEIGHT CONVERSION PROGRAM

        // Declare variables

        // welcome message

        // prompt for user choice

        // option 1 convert lbs to kgs

        // option 2 convert kgs to lbs

        // else print not a valid choice

        double lbs;
        double kgs;
        double Option1;
        double Option2;
        int choice;

        Scanner scanner = new Scanner(System.in); 

        System.out.println("**************************WELCOME TO WEIGHT CONVERSION**************************");
        System.out.println("Option 1: Convert lbs to kgs.");
        System.out.println("Option 2: convert kgs to lbs.");
        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in lbs: ");
            lbs = scanner.nextDouble();

            Option1 = lbs * 0.453592;
            System.out.printf("The weight is %.2f kgs",Option1);
            
        }
        else if (choice == 2){
            System.out.println("Enter the weight in kgs: ");
            kgs = scanner.nextDouble();

            Option2 = kgs * 2.20462;
            System.out.printf("The weight in %.2f lbs",Option2);
        }
        else{
            System.out.println("Choose an valid option!!");
        }

        

        scanner.close();


    }

}
