import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a=0,b=0,c=0,n=s.length(),ptr=0;
        while(ptr!=n){
            if(s.charAt(ptr)=='A'){
                a++;
            }else if(s.charAt(ptr)=='B' && a>b){
                b++;
            }else if(s.charAt(ptr)=='C' && b>c){
                c++;
            }
            ptr++;
        }
        System.out.println(c);
    }
}