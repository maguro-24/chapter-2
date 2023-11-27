
import java.util.*;
public class DistanceForm {
    
    public static void main(String[] args) {
        double x1,x2,y1,y2,d;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is the X variable in the first cordinate:");
        x1 = scan.nextInt();
        System.out.println("What is the Y variable in the first cordiante?");
        y1 = scan.nextInt();
        System.out.println("What is the X variable in the second cordinate?");
        x2 = scan.nextInt();
        System.out.println("What is the Y varibale in the second cordinate?");
        y2 = scan.nextInt();
        
        
        d = Math.sqrt((Math.pow(x2 - x1,2 )) + (Math.pow(y2 - y1,2)));
         
        System.out.println("The distance between: " + x1 + "," + y1 + " and " + x2 + "," + y2 + " is: " + d);
        
        
        
    }

}
