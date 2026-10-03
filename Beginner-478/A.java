import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int mod=(m+n)%n;
        for(int ind=0;ind<n;ind++){
            if(ind<mod){
                System.out.println((m+n)/n);
            }else{
                System.out.println(((m+n)/n)-1);
            }            
        }
    }
}