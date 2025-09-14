import java.util.*;

public class B {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      StringBuilder sb = new StringBuilder();
      boolean flag=false;
      for(int ind=0;ind<str.length();ind++){
            if(flag==false && str.charAt(ind)=='.'){
               sb.append('o');
               flag=true;
            }else if(flag==true && str.charAt(ind)=='.'){
               sb.append('.');
            }else if(flag==true && str.charAt(ind)=='#'){
               sb.append('#');
               flag=false;
            }else if(str.charAt(ind)=='#'){
               sb.append('#');
            }
      }
      System.out.println(sb);
   }
}
