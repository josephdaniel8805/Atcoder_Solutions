import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q=sc.nextInt();
        String S=sc.next(),T=sc.next();
        int n=S.length(),m=T.length();
        int[] prefix = new int[n+1];
        for (int ind=0;(ind+m)<=n;ind++){
            if (S.substring(ind,ind+m).equals(T)){
                prefix[ind+1]=1;
            }
        }
        for(int ind=1;ind<=n;ind++){
            prefix[ind]+=prefix[ind-1];
        }
        while(Q-->0){
            int L=sc.nextInt(),R=sc.nextInt();
            int left=L-1,right=R-m;
            if (left<=right && (prefix[right+1]-prefix[left])>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}