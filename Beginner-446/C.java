import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),d=sc.nextInt();
            long a[] = new long[n];
            long b[] = new long[n];
            long stock[] = new long[n];
            for(int ind=0;ind<n;ind++){
                a[ind]=sc.nextLong();
            }
            for(int ind=0;ind<n;ind++){
                b[ind]=sc.nextLong();
            }
            long total=0;
            int left=0;
            for(int ind=0;ind<n;ind++){
                stock[ind]=a[ind];
                total+=a[ind];
                long need=b[ind];
                while(need>0){
                    if(stock[left]<=need){
                        need-=stock[left];
                        total-=stock[left];
                        stock[left]=0;
                        left++;
                    }else{
                        stock[left]-=need;
                        total-=need;
                        need=0;
                    }
                }
                if((ind-d)>=0){
                    total-=stock[ind-d];
                    stock[ind-d]=0;
                }
            }
            System.out.println(total);
        }
        
    }
}