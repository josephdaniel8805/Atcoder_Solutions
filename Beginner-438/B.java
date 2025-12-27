import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();sc.nextLine();
        String s=sc.nextLine(),t=sc.nextLine();
        int min=Integer.MAX_VALUE;
        for(int row=0;row<=(n-m);row++){
            int ans=0;
            for(int col=0;col<m;col++){
                char ch1=s.charAt(row+col),ch2=t.charAt(col);
                if(ch1>=ch2){
                    ans+=((ch1-ch2));
                }else{
                    ans+=((ch1-ch2+10));
                }
            }
            if(ans<min){
                min=ans;
            }
        }
        System.out.println(min);
    }
}




