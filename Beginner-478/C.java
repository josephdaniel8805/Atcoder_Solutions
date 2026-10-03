import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int arr[] = new int[n];
        int sorted[] = new int[n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextInt();
            sorted[ind]=arr[ind];
        }
        Arrays.sort(arr);
        int left=n,right=-1;
        for(int ind=0;ind<n;ind++){
            if((arr[ind])!=sorted[ind]){
                left=Math.min(left,ind);
                right=Math.max(right,ind);
            }
        }
        if((right-left)<k){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}