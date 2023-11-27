
import java.util.*;

public class HeronsForm {

    public static void main(String[] args) {
       double a,b,c,s,area;
       Scanner scan = new Scanner(System.in);
       
        System.out.println("What are the 3 side lengths?");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        
        s = (a + b + c) /2 ;
        
        area = (Math.sqrt(s * (s - a) * (s - b) *(s - c)));
        
        System.out.println("The area of the triangle is : \n" + area);
        
       
    }
    
    
}
