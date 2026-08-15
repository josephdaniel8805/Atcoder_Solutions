import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q=sc.nextInt(),v=sc.nextInt(),time=0,offset=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(Q-->0){
            int q=sc.nextInt(),t=sc.nextInt();
            offset+=(t-time);
            time=t;
            if(q==1){
                int w=sc.nextInt();
                pq.add(w-offset);
                time=t;
            }else{
                if(!pq.isEmpty()){
                    int ele1=pq.poll()+offset;
                    if(ele1>=v){
                        System.out.println(v);
                    }else{
                        System.out.println(ele1);
                    }
                }else{
                    System.out.println(-1);
                }
            }
        }
    }     
}