import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        for(int ind=0;ind<str.length()-2;ind++){
            if(str.charAt(ind)!=str.charAt(ind+1) && str.charAt(ind)!=str.charAt(ind+2)){
                System.out.println(str.charAt(ind));
                break;
            }else if(str.charAt(ind)!=str.charAt(ind+1) && str.charAt(ind+1)!=str.charAt(ind+2)){
                System.out.println(str.charAt(ind+1));
                break;
            }else if(str.charAt(ind)!=str.charAt(ind+2) && str.charAt(ind+1)!=str.charAt(ind+2)){
                System.out.println(str.charAt(ind+2));
                break;
            }
        }
    }
}
