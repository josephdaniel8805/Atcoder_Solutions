import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long C = sc.nextLong();
        
        long k = X / (1000 + C); 
        long ans = k * 1000;
        
        System.out.println(ans);
    }
}
