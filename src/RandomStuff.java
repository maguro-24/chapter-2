

public class RandomStuff {
    public static void main(String[] args) {
        
        Double rand = Math.random();
        
        System.out.println(rand);
        
        int num = (int)(Math.random()*10 + 1);
        System.out.println(num);
        System.out.println(rand.compareTo((double)num));
    }

}
