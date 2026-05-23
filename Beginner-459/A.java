import java.util.*;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s="HelloWorld";
        int x=sc.nextInt(),n=s.length();
        for(int ind=0;ind<n;ind++){
            if((ind+1)==x){
                continue;
            }
            System.out.print(s.charAt(ind));
        }
    }
}