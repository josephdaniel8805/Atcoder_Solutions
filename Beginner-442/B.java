import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt(),volume=0;
        boolean playing=false;
        while(q-->0){
            int a=sc.nextInt();
            if(a==1) volume++;
            if(a==2){
                if(volume>0){
                    volume--;
                }
            }
            if(a==3){
                if(playing){
                    playing=false;
                }else{
                    playing=true;
                }
            }
            if(playing && volume>2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
