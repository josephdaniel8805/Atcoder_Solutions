import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextInt();
        }
        int sum=0,count=0;
        for(int row=0;row<n;row++){
            sum+=arr[row];
            for(int col=row+1;col<n;col++){
                sum+=arr[col];
                boolean flag=true;
                for(int ind=row;ind<=col;ind++){
                    if(sum%arr[ind]==0){
                        flag=false;
                    }
                }
                if(flag){
                    count++;
                }
            }
            sum=0;
        }
        System.out.println(count);
    }
}
