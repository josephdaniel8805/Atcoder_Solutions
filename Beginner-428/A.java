import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt(); 
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        boolean flag=false;
        int ans=0;
        while(x>0){
            if(flag){
                x-=b;
                flag=false;
            }else{
                if(x<a){
                    ans+=(s*x);
                    break;
                }
                ans+=(s*a);
                x-=a;
                flag=true;
            }
        }
        System.out.println(ans);
    }
    
}
