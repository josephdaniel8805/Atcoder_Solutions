import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][] = new int[n][n];
        int x=0,y=(n-1)/2,write=1;
        arr[x][y]=write++;
        int operations=(n*n)-1;
        while(operations-->0){
            if(arr[((x-1+n)%n)][((y+1+n)%n)]==0){
                x=((x-1+n)%n);y=((y+1+n)%n);               
            }else{
                x=((x+1+n)%n); 
                while(arr[x][y]!=0){
                    x=((x+1+n)%n);   
                }
            }
            arr[x][y]=write++;
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
