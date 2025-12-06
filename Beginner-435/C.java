import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long arr[] = new long[n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextLong();
        }
        long count=1;
        int left=0, right = (int)(arr[0] - 1);
        if(right >= n) right = n - 1;
        while(left < right){
            left++;
            if(arr[left] + left - 1 > right){
                right = (int)(arr[left] + left - 1);
                if(right >= n) right = n - 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
