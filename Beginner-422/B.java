import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R=sc.nextInt(),C=sc.nextInt();
        char grid[][]= new char[R][C];
        for(int row=0;row<R;row++){
            String line=sc.next();
            for(int col=0;col<C;col++){
                grid[row][col]=line.charAt(col);
            }
        }
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]=='#'){
                    int count=0;
                    int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};
                    for(int ind=0;ind<4;ind++){
                        int newrow=row+dir[ind][0];
                        int newcol=col+dir[ind][1];
                        if(newrow<R && newcol<C && newrow>=0 && newcol>=0){
                            if(grid[newrow][newcol]=='#'){
                                count++;
                            }
                        }
                    }
                    if(count!=2 && count!=4){
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}
