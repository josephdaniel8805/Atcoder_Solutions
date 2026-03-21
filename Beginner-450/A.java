import java.util.*;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            if(n==1){
                System.out.print(n);
                break;
            }
            System.out.print(n+",");
            n--;
        }
    }
}