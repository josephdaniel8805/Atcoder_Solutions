import java.util.*;

public class C {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();sc.nextLine();
      String word=sc.nextLine();
      int len=2*n;  
      long dist1=0,num1=0;
      for(int ind=0;ind<len;ind++){
         if(word.charAt(ind)=='B'){
            dist1+=(Math.abs(ind-num1));
            num1+=2;
         }
      }
      long dist2=0,num2=0;
      for(int ind=0;ind<len;ind++){
         if(word.charAt(ind)=='A'){
            dist2+=(Math.abs(ind-num2));
            num2+=2;
         }
      }
      System.out.println(Math.min(dist1,dist2));
   }
}
