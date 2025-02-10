package JavaProject.src.PRACTICE;

import java.util.Scanner;

public class ifStatement{
    public static void main(String[] args) {
        
int age;
        String name;
        boolean isStudent;
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
       
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();
       
        System.out.println("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

       //GROUP 1
       
       if (name.isEmpty()) {
        System.out.println("Please enter your name!!");
        
       }
       else{
        System.out.println("Hello " + name);
       }


       //GROUP 2

       if (age >= 150){
        System.out.println("You can't live that long!!");
       }
       else if (age >= 18){
        System.out.println("You are an adult!!");
       }
       else if(age < 0){
        System.out.print("You haven't born yet!!");
       }
       else if(age == 0){
        System.out.println("Please enter a valid age number!!");
       }

       else{
        System.out.println("You are an child!!");
       }


       //GROUP 3

       if (isStudent){
        System.out.println("You are an STUDENT");
       }
       else{
        System.out.println("Your are not an STUDENT!!");
       }
    
       scanner.close();


    }

}