import java.util.Scanner;

public class FibnacciNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        int a=0;
        int b = 1;
        int sum =0;
        System.out.println(a);
        System.out.println(b);
        

        for (int i = 0; i <n; i++) {
            sum = a+b;
            
            System.out.println(sum);
            
            a=b;
            b=sum;

            


            
        }




    }

    
}
