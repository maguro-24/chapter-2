import java.util.Scanner;

public class TempConverter {
    
    public static void main(String[] args) {
       
        double F;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the temperature in Fahrenheit: ");
        F = scan.nextDouble();
        
     
        
        System.out.println(F + "f" + " is " + ((5/9.0)*(F-32)) + " C");
        
        
        
    }
    
    
    

}
