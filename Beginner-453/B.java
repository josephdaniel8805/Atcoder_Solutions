import java.util.*;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(),x=sc.nextInt();
        int a_prev=-1,a=-1;
        for(int ind=0;ind<=t;ind++){
            if(ind==0){
                a_prev=sc.nextInt();
                System.out.println(ind+" "+a_prev);
                
            }else{
                a=sc.nextInt();
                if(Math.abs(a_prev-a)>=x){
                    System.out.println(ind+" "+a);
                    a_prev=a;
                }
                
            }
        }
    }
    
}