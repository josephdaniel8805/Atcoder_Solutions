import java.util.*;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int n=s.length();
        long len=1,ans=0,mod=998244353;
        char ch=s.charAt(0);
        for(int ind=1;ind<n;ind++){
            char temp=s.charAt(ind);
            if(temp!=ch){
                len++;
            }else{
                ans=(ans+(len*(len+1)/2)%mod)%mod;
                len=1;
            }
            ch=temp;
        }
        ans=(ans+(len*(len+1)/2)%mod)%mod;
        System.out.println(ans%mod);
    }
}