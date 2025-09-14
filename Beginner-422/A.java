import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        StringBuilder sb= new StringBuilder();
        int first= str.charAt(0)-'0';
        int last=str.charAt(n-1)-'0';
        if(last==8){
            last=1;
            first++;
        }else{
            last++;
        }
        System.out.println(first+"-"+last);
    }
}
