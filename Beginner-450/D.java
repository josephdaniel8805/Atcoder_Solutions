import java.util.*;

public class D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        long arr[] = new long[n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextLong();
            arr[ind]%=k;
        }
        Arrays.sort(arr);
        long ans=arr[n-1]-arr[0];
        for(int ind=0;ind<n-1;ind++){
            ans=Math.min(ans,(arr[ind]+k-arr[ind+1]));
        }
        System.out.println(ans);
    }
}