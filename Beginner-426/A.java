import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list= new ArrayList<>();
        list.add("Ocelot");
        list.add("Serval");
        list.add("Lynx");
        String x=sc.next(),y=sc.next();
        if(list.indexOf(x)>=list.indexOf(y)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
