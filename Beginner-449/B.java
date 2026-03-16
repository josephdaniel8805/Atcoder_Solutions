import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt(),w=sc.nextInt(),q=sc.nextInt();
        while(q-->0){
            int qu=sc.nextInt(),t=sc.nextInt();
            if(qu==1){
                System.out.println(w*t);
                h-=t;
            }else{
                System.out.println(h*t);
                w-=t;
            }
        }
    }
}