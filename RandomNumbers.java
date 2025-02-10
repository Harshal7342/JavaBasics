package JavaProject.src.PRACTICE;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        
        double num1;
        double num2;
        double num3;

        Random random = new Random();
    
        num1 = random.nextDouble(1, 101);
        num2 = random.nextDouble(1, 101);
        num3 = random.nextDouble(1, 101);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);



         
        /*boolean isHeads;
        
        isHeads = random.nextBoolean();
        
        Random random = new Random();
        
        
        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }*/
    
    }
}
