import java.util.*;

public class B {
   public static void main(String args[]) {
      Scanner sc =  new Scanner(System.in);
      long x=sc.nextInt(),y=sc.nextInt();
      for(int ind=0;ind<9;ind++){
         if(ind%2==0){
            x=reverse(y+x);
         }else{
            y=reverse(y+x);
         }
         
      }
      System.out.println(y);
   }
   private static long reverse(long n){
      long sum=0;
      while(n!=0){
         sum=sum*10+(n%10);
         n/=10;
      }
      return sum;
   }
   
}
