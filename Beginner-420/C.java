import java.util.*;

public class C{
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int q=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      long sum=0;
      for(int ind=0;ind<n;ind++){
         a[ind]=sc.nextInt();
      }
      for(int ind=0;ind<n;ind++){
         b[ind]=sc.nextInt();
         sum += Math.min(a[ind],b[ind]);
      }
      for(int ind=0;ind<q;ind++){
         char ch=sc.next().charAt(0);
         int index=sc.nextInt()-1;
         int num=sc.nextInt();
          sum-=Math.min(a[index], b[index]);
         if(ch=='A'){
            a[index]=num;
         }else{
            b[index]=num;
         }
         sum+=Math.min(a[index], b[index]);
         System.out.println(sum);
      }
   }
}
