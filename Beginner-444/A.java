import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        while(n!=0){
            set.add(n%10);
            n/=10;
        }
        if(set.size()<=1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
