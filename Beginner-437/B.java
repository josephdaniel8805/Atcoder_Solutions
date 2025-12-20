import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt(),w=sc.nextInt(),n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int a[][] = new int[h][w];
        for(int row=0;row<h;row++){
            for(int col=0;col<w;col++){
                a[row][col]=sc.nextInt();
            }
        }
        for(int ind=0;ind<n;ind++){
            int temp=sc.nextInt();
            list.add(temp);
        }
        int max=0;
        for(int row=0;row<h;row++){
            int curr=0;
            for(int col=0;col<w;col++){
                if(list.contains(a[row][col])){
                    curr++;
                }
            }
            max=(max>curr)?max:curr;
        }
        System.out.println(max);
    }    
}
