import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
        while((y*z)<=x){
            if((y*z)==x){
                System.out.println("Yes");
                return;
            }
            x++;y++;
        }
        System.out.println("No");
    }
}
