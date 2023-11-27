import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
       
        double n1, n2, n3;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("input 3 numbers :");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();
        
        System.out.println("The average of " + n1 + " " + n2 + " " + n3 + " is " + ((n1 + n2 + n3)/3));
        
            
    }
    
    
    
}
