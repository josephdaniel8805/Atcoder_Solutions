import java.util.*;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R=sc.nextInt(),C=sc.nextInt(),count=0;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                count=0;
                if((row-1)>-1){
                    count++;
                }
                if((row+1)<R){
                    count++;
                }
                if((col-1)>-1){
                    count++;
                }
                if((col+1)<C){
                    count++;
                }
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}