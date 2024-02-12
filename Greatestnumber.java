import java.util.Scanner;

public class Greatestnumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter  a number");
         int a = sc.nextInt();
         System.out.println("enter b number ");
         int b = sc.nextInt();
         System.out.println("enter c number");
         int c = sc.nextInt();

         if (a>b && a > c) {
            System.out.println(" greatest is " + a);

            
         }

         else if (b>c && b > a) {
            System.out.println(" greatest is " + b);
            
         }
         
         else{ System.out.println(" greatest is " +c);
         
    }
    }
}
