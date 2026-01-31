import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),sum=n,ans=0;
        while(sum<k){
            sum+=(++n);
            ans++;
        }
        System.out.println(ans);
    }
}
