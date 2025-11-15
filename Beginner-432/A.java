import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.print(a);
            if(b>c){
                System.out.print(b+""+c);
            }else{
                System.out.print(c+""+b);
            }
        }else if(b>=c){
            System.out.print(b);
            if(a>c){
                System.out.print(a+""+c);
            }else{
                System.out.print(c+""+a);
            }
        }else{
            System.out.print(c);
            if(a>b){
                System.out.print(a+""+b);
            }else{
                System.out.print(b+""+a);
            }
        }
    }
}
 