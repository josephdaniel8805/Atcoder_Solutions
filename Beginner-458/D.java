import java.util.*;

public class D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int q=sc.nextInt();
        PriorityQueue<Integer> first = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> last = new PriorityQueue<>();
        while(q-->0){
            int q1=sc.nextInt(),q2=sc.nextInt();
            if((q1>=x && q2>=q1) || (q1<=x && q2<=q1)){
                int temp=x;
                x=q1;
                q1=temp;
            }else if((q2>=x && q1>=q2) || (q2<=x && q1<=q2)){
                int temp=x;
                x=q2;
                q2=temp;
            }
            if(q1>q2){
                int temp=q1;
                q1=q2;
                q2=temp;
            }
            first.add(q1);
            last.add(q2);
            while(first.peek()>x){
                int temp=first.poll();
                first.add(x);
                x=temp; 
            }
            while(last.peek()<x){
                int temp=last.poll();
                last.add(x);
                x=temp; 
            }
            System.out.println(x);
        }
        
    }
}