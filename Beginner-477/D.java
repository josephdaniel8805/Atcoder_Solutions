import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),Q=sc.nextInt();
        boolean tile[] = new boolean[n];
        char color[] = new char[n];
        int last[] = new int[n];
        Arrays.fill(color,'a');
        char globalcolor='a';
        int globaltime=0;
        while(Q-->0){
            int q=sc.nextInt();
            if(q==1){
                int t=sc.nextInt()-1;
                if(tile[t]){
                    tile[t]=false;
                    last[t]=globaltime;
                }else{
                    tile[t]=true;
                    if(last[t]<globaltime){
                        color[t]=globalcolor;
                        last[t]=globaltime;
                    }
                }
            }else if(q==2){
                globalcolor=sc.next().charAt(0);
                globaltime++;
            }
        }
        for(int ind=0;ind<n;ind++){
            if(!tile[ind] && last[ind]<globaltime){
                color[ind]=globalcolor;
            }
        }
        for(char ch : color){
            System.out.print(ch);
        }
    }     
}