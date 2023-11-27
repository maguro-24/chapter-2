

public class PassCode {
    public static void main(String[] args) {
        
        int a,b,c,d;
        
        
        a = (int)(Math.random()*9+1);
        b = (int)(Math.random()*10);
        c = (int)(Math.random()*10);
        d = (int)(Math.random()*9+1);
        System.out.println("your pass code is: " + a + b + c + d);
        
    }
}
