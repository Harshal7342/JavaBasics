package JavaProject.src.PRACTICE;

public class Variables{
    public static void main(String[] args) {

        //well this wouldn't show in output
        /*and 
        *this
        *too
        */

        //System.out.print("I am new to java!!!\n");
        //System.out.print("And i will try harder");

        int age = 20;
        double Age = 20.5;
        char grade = 'A';
        char symbol = '!';

        boolean isStudent = true;
        boolean forSale = true;

        String name = "Monarch";
        String email = "monarch004@gmail.com";
        String car = "Rolls Royce";


        System.out.println("Your gaming name is "+name+" and email is "  + email);
        System.out.println("Your age is " + age + " and name is " + name);

        if(forSale){
           System.out.print("There is a " + car + " for sale");
        }
        else{
            System.out.print("There is no " + car + " for sale");
        }
        
        System.out.println(forSale);
        
        
        if(isStudent){
            System.out.print("You are a student!");
        }

        else{
            System.out.print("You are NOT a student!!");
        }



        System.out.print("My grade is "+ grade +"\n");
        System.out.print("My symbol is "+ symbol +"\n");
        System.out.println("My age is "+age);
        System.out.print(Age);

    }
}