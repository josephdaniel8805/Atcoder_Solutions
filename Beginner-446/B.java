import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        boolean juice[]= new boolean[m+1];
        while(n-->0){
            int l=sc.nextInt();
            int ans=0;
            for(int ind=0;ind<l;ind++){
                int temp=sc.nextInt();
                if(juice[temp]){
                    continue;
                }else if(ans==0){
                        juice[temp]=true;
                        ans=temp;
                    
                }
            }
            System.out.println(ans);
        }
        
    }
}