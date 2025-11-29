import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        HashMap<Integer,Double> map = new HashMap<>();
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int ind=0;ind<m;ind++){
            map.put(ind+1,0.0);
            count.put(ind+1,0);
        }
        for(int ind=0;ind<n;ind++){
            int type=sc.nextInt(),size=sc.nextInt();
            map.put(type,map.getOrDefault(type,0.0)+size);
            count.put(type,count.getOrDefault(type,0)+1);
        }
        for(Map.Entry<Integer,Double> entry : map.entrySet()){
            Double avg=entry.getValue()/count.getOrDefault(entry.getKey(), 0);
            System.out.println(avg);
        }
    }
}
