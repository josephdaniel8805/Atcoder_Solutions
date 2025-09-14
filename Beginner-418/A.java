import java.util.*;
 public class A{
   public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     String str=sc.next();
     int len=str.length();
     if(len<3){
       System.out.println("No");
       return;
     }
     if(str.charAt(len-1)=='a' && str.charAt(len-2)=='e' && str.charAt(len-3)=='t'){
       System.out.println("Yes");
     }else{
       System.out.println("No");
     }
   }
 } 