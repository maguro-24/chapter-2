import java.util.Scanner;

public class Arithametic {

    public static void main(String[] args) {
      
         double n1, n2, n3;
                 
         Scanner scan = new Scanner(System.in);
         
         System.out.println("enter 3 numbers: ");
         n1 = scan.nextDouble();
         n2 = scan.nextDouble();
         n3 = scan.nextDouble();
         
        System.out.println("The sum is: " + (n1+n2+n3));
        System.out.println("The difference is: " + (n1-n2-n3));
        System.out.println("The product is: " + (n1*n2*n3));
        
    }
    
    
    
    
}
