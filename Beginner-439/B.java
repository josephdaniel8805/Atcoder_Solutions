import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=1 && n!=4){
            n=happy(n);
        }
        if(n==1){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
    private static int happy(int n){
        int sum=0;
        while(n!=0){
            sum+=((n%10)*(n%10));
            n/=10;
        }
        return sum;
    }
}
