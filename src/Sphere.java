
import java.util.*;
public class Sphere {
    
    public static void main(String[] args) {
        double r, pi = 3.14, sa, v;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is the radius of the sphere?");
        r = scan.nextDouble();
        
        v = ((4/3) * pi * (Math.pow(r ,3)));
        sa = (4 * pi * (Math.pow(r, 2)));
        
        System.out.println("The volume of the sphere is :\n" + v + "\nThe surface area is:\n" + sa);
        
        
    }

}
