import java.util.*;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Long> map = new HashMap<>();
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n=sc.nextInt(),x=sc.nextInt();
        for(int ind=0;ind<n;ind++){
            int temp=sc.nextInt();
            map.put(temp,map.getOrDefault(temp,0L)+temp);
        }
        for(long num : map.values()){
            pq.add(num);
        }
        long ans=0;
        while(x>0 && !pq.isEmpty()){
            x--;
            pq.poll();
        }
        for(long num : pq){
            ans+=num;
        }
        System.out.println(ans);
    }
}