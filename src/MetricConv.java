import java.util.Scanner;

public class MetricConv {

    public static void main(String[] args) {
        
        double miles;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input distance in miles: ");
        miles = scan.nextDouble();
        
        System.out.println(miles + " miles is " + miles*1.6 + " kilometers");
        
        
        
    }
    
    
    
}
