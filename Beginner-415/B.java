import java.util.*;

public class B {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      boolean flag = false;
      for(int i=1;i<=str.length();i++){
         char ch=str.charAt(i-1);
         if(ch=='#'&& flag==false){
            System.out.print(i+",");
            flag =true;
         }else if(ch=='#' && flag== true){
            System.out.println(i);
            flag=false;
         }
      }
   }
}
