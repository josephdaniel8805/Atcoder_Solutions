import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),v=sc.nextInt();
        long arr[] = new long[n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextInt();
        }
        long ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if((i+j+k+3)<=v){
                        ans=Math.max(ans,arr[i]+arr[j]+arr[k]);
                    } 
                }
            }
        }
        System.out.println(ans);
    }
}