import java.util.*;

public class A {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int l=sc.nextInt();
      int r=sc.nextInt();
      sc.nextLine();
      String str=sc.nextLine();
      boolean flag=false;
      for(int ind=l-1;ind<r;ind++){
         if('x'==str.charAt(ind)){
            flag=true;
         }
      }
      if(flag==false){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
   }
}
