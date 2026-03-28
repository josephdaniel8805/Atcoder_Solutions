import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        if((s.length()%5!=0 && s.length()>4) ||(s.length()<5)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}