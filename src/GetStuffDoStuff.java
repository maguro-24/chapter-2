
import java.util.Scanner;

public class GetStuffDoStuff {

    public static void main(String[] args) 
    {
      
        Scanner scan = new Scanner(System.in);
        
        String name; 
        int age;
        
        System.out.println("What is your name?");
        name = scan.nextLine();
        
        System.out.println("And what is your name a" + name + "?");
        age = scan.nextInt();
        
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        
        
       
        
        
        
    }
    
}
