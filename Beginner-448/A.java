import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        for(int ind=0;ind<n;ind++){
            int temp=sc.nextInt();
            if(temp<x){
                x=temp;
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}