package JavaProject.src.PRACTICE;

public class morePrintf {
    public static void main(String[] args) {
        
       String name = "Monarch";
       char firstletter = 'M';
       int age = 20; 
       double height = 60.5;
       boolean isEmployed = true;

       System.out.printf("Hello %s\n", name);
       System.out.printf("Your name starts with letter %c\n", firstletter);
       System.out.printf("Your height is %.1f\n", height);
       System.out.printf("Your age is %d\n", age);
       System.out.printf("Employed: %b\n", isEmployed);

       System.out.printf("%s is %d years old and his height is %.1f, his firstletter starts with %c ", name, age, height, firstletter);

       // + = output a plus
       // , = comma grouping seperator
       // ( = negative numbers are enclosed in ()
       // space = display a minus if negative, space if positive

       double price1 = 9999.9;
       double price2 = 10000.15;
       double price3 = -5400.01;

       System.out.printf("%, .2f\n", price1);
       System.out.printf("%, .2f\n", price2);
       System.out.printf("% ,(.2f\n", price3);
       

       
       //[Width]

       // 0 = zero padding
       // number = right justified padding
       // negative number = left justified padding

       int id1 = 1;
       int id2 = 23;
       int id3 = 456;
       int id4 = 7890;

       System.out.printf("%04d\n", id1);
       System.out.printf("%04d\n", id2);
       System.out.printf("%04d\n", id3);
       System.out.printf("%04d\n", id4);

       
    }
}
