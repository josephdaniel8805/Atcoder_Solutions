import java.util.*;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int x=sc.nextInt(),n=s.length();
        for(int ind=x;ind<n-x;ind++){
          System.out.print(s.charAt(ind));
        }
    }
}