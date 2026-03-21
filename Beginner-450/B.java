import java.util.*;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=false;
        long mat[][] = new long[n-1][n-1];
        int R=n-1,C=n-1;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                mat[row][col]=sc.nextLong();
            }
            C--;
        }
        for(int row=0;row<n;row++){
            for(int col=row+1;col<n;col++){
                for(int ind=col+1;ind<n;ind++){
                    if((mat[row][col-row-1]+mat[col][ind-col-1])<mat[row][ind-row-1]){
                        System.out.println("Yes");
                        return;
                    }
                }
                    
            }
        }
        System.out.println("No");
        
    }
}