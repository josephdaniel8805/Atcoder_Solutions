import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if(ch=='B'){
            System.out.println('Y');
        }else if(ch=='Y'){
            System.out.println('R');
        }else if(ch=='R'){
            System.out.println('B');
        }
    }     
}