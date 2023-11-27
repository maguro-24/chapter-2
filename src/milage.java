import java.util.*;

public class milage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1,x2,mpg, g ;
        
        System.out.println("odometer before:");
        x1 = scan.nextDouble();
        System.out.println("odometer after:");
        x2 = scan.nextDouble();
        System.out.println("Amount of gas used:");
        g = scan.nextDouble();
        
        mpg = ((x2-x1) / g);
        System.out.println("MPG:\n" + mpg);
            
        
        
        
        
    }
}
