package JavaProject.src.PRACTICE;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args){

        //.substring() = A method used to extract a portion of a string .substring(start, end)
        //               .substring(start, end)

        String email;
        String username;
        String domain;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email here: ");
        email = scanner.nextLine();

        if (email.contains("@gmail.com"  )){
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@"));

        System.out.println("Your username is: " + username);
        System.out.println("Your domain is: " + domain);
        }

        else{
            System.out.println("email should contain a '@gmail.com' in it!!");
        }
        





        scanner.close();


    }
}