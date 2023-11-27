import java.util.*;
import java.text.DecimalFormat;
public class CoinCounter {
    public static void main(String[] args) {
       
        int q,d,n,p;
        double t,Q,D,N,P;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the amount of quarters:");
        q = scan.nextInt();
         System.out.println("Enter the amount of dimes:");
        d = scan.nextInt();
        System.out.println("Enter the amount of nickles:");
        n = scan.nextInt();
         System.out.println("Enter the amount of pennies:");
        p = scan.nextInt();
        
        DecimalFormat money = new DecimalFormat("0.00");
          
        Q = .25;
        D = .10;
        N = .05;
        P = .01;
        
        t = ((q *Q) + (d*D) + (n*N) + (p*P));
        
        System.out.println("$" + money.format(t));
        
        
   
              
    }

}
