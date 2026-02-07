import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),k=sc.nextInt(),count=0;
        for(int ind=1;ind<=n;ind++){
            if(check(ind,k)) count++;
        }
        System.out.println(count);
    }
    private static boolean check(int n,int k){
        int sum=0;
        while(n!=0 && sum<=k){
            sum+=(n%10);
            n/=10;
        }
        if(sum==k) return true;
        return false;
    }
}
