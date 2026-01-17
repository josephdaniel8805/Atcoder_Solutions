import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt(),q=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
        if(x>=p && y>=q && x<=p+99 && y<=q+99){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
