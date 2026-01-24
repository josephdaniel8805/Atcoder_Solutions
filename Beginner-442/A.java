import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int ind=0;ind<s.length();ind++){
            if(s.charAt(ind)=='i' || s.charAt(ind)=='j') count++;
        }
        System.out.println(count);
    }
}
