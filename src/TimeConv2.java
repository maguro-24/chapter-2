import java.util.Scanner;

public class TimeConv2 {

    public static void main(String[] args) {
        
        int ts, m, h, s;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter time in seconds: ");
        ts = scan.nextInt();
        
        h = (ts /3600);
        m = ((ts % 3600) /60);
        s = ts % 60;
        
        System.out.println(ts + " seconds is: " + h + " hours " + m + " minutes "+ s + " seconds ");
        
    }
    
    
}
