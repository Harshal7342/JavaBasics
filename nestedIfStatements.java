package JavaProject.src.PRACTICE;

public class nestedIfStatements {
    public static void main(String[] args) {

       boolean isStudent = true;
       boolean isSenior = true;
       //double price = 9.99;
       

       if(isStudent){
        if(isSenior){
            System.out.println("You get a both the discount of 30%!!");
        }
        else{
            System.out.println("You get a student discount of 10%!!");
                           
        }
       }
       else{
        if(isSenior){
        System.out.println("You get a senior discount of 20%!!");
        }
       }

       /*System.out.println("Are you a student: ");
       isStudent = scanner.nextBoolean();

       System.out.println("Are you a senior: ");
       isSenior = scanner.nextBoolean();
       */

    }
}
