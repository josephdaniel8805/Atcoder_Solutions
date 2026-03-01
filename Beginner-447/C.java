import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine(),s2=sc.nextLine();
        int n1=s1.length(),n2=s2.length();
        int ptr1=0,ptr2=0,count=0;
        while(ptr1<n1 || ptr2<n2){
            if(ptr1<n1 && ptr2<n2 && s1.charAt(ptr1)==s2.charAt(ptr2)){
                ptr1++;
                ptr2++;
            }else if(ptr1<n1 && s1.charAt(ptr1)=='A'){
                ptr1++;
                count++;
            }else if(ptr2<n2 && s2.charAt(ptr2)=='A'){
                ptr2++;
                count++;
            }else{
                System.out.println(-1);
                return;
            }
        }
        System.out.println(count);
    }
}