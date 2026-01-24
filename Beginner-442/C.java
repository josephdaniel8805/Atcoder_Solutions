import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        long[] grid= new long[n];
        for(int ind=0;ind<m;ind++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            grid[a-1]++;
            grid[b-1]++;
        }
        for(int row=0;row<n;row++){
            long count=n-1-grid[row];
            if(count>2){
                long ans=count*(count-1)*(count-2)/6;
                System.out.print(ans+" ");
            }else{
                System.out.print(0+" ");
            }
        }
    }
}
