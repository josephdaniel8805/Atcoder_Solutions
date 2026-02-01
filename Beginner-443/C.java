import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long T = sc.nextLong();
        long[] arr = new long[N];
        for (int ind=0;ind <N;ind++) {
            arr[ind] = sc.nextLong();
        }
        long ans = 0;
        long time = 0;   
        for(int ind=0;ind<N;ind++){
            long a = arr[ind];
            if (a>=time) {
                ans+=(a-time);
                time=a+100;
            }
        }
        if(time<T){
            ans+=(T-time);
        }
        System.out.println(ans);
    }
}
