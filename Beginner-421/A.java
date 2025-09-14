import java.util.*;

public class A{
   public static void main(String args[]) {
      Scanner sc =  new Scanner(System.in);
      int n=sc.nextInt();sc.nextLine();
      String words[]=new String[n];
      for(int ind=0;ind<n;ind++){
         words[ind]=sc.nextLine();
      }
      int pos=sc.nextInt(); String search=sc.next();
      if(words[pos-1].equals(search)){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
   }
   
}
