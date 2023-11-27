import java.util.Scanner;

public class TimeConv {

    public static void main(String[] args) {
   
        double h, m, s;
        Scanner scan = new Scanner (System.in);
        
        
        System.out.println("Enter time in order of hour, minute, seconds: ");
        h = scan.nextDouble();
        m = scan.nextDouble();
        s = scan.nextDouble();
        
        System.out.println(h + " hours, " + m + " minutes, and " + s + " seconds is equal to:");
        System.out.println(((3600*h) + (60*m) + (s)) + " seconds");
        
        
                
              
    }
    
    
}
