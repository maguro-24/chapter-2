import java.util.*;
import java.text.DecimalFormat;

public class CanIHaveYourNumber {
    
    public static void main(String[] args) {
        
        int a,b,c;
        Random rand = new Random();
        
        a = (rand.nextInt(7)+1)* 100 + (rand.nextInt(8)*10) + rand.nextInt(8);
        b = rand.nextInt(743);
        c = rand.nextInt(10000);
        
        DecimalFormat B = new DecimalFormat("000");
        DecimalFormat C = new DecimalFormat("0000");
     
        
        System.out.println(a + "-" + B.format(b) + "-" + C.format(c));
        
        
    }
    
    

}
