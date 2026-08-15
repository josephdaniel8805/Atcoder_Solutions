import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),d=sc.nextInt();
        if((n-d)==9 || (n+d)==9 || (n*d)==9 || (n%d==0 && n/d==9)){
            System.out.println("Nine");
        }else{
            System.out.println("Nein");
        }
        
    }     
}