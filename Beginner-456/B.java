import java.util.*;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] dies=new int[3][7];
        for(int row=0;row<3;row++){
            for(int col=0;col<6;col++){
                int temp=sc.nextInt();
                dies[row][temp]++;
            }
        }
        int poss[][] = {{4,5,6},{4,6,5},{5,6,4},{5,4,6},{6,5,4},{6,4,5}};
        double ans=0.0;
        for(int[] p : poss){
            double prob=1.0;
            for(int ind=0;ind<3;ind++){
                prob*=(dies[ind][p[ind]]/6.0);
            }
            ans+=prob;
        }
        System.out.println(ans);
    }
}