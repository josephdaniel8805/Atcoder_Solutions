import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long A=sc.nextLong(),B=sc.nextLong(),C=sc.nextLong();
            System.out.println(Math.min(Math.min(A,C),(A+B+C)/3));
        }
    }
}
