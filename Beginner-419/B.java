import java.util.*;

public class B {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      for(int ind=0;ind<n;ind++){
         int type=sc.nextInt();
         if(type==1){
            pq.add(sc.nextInt());
         }else if(type==2){
            System.out.println(pq.poll());
         }
      }
      
   }
}