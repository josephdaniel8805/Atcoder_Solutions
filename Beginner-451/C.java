import java.util.*;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while(n-->0){
            int q=sc.nextInt();
            int h=sc.nextInt();
            if(q==1){
                map.put(h,map.getOrDefault(h, 0)+1);
                count++;
            }else{
                HashSet<Integer> set = new HashSet<>();
                for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                    if(entry.getKey()>h){
                        break;
                    }else if(entry.getKey()<=h){
                        count-=entry.getValue();
                        set.add(entry.getKey());
                    }
                }
                for(int num : set){
                    map.remove(num);
                }
            }
            System.out.println(count);
        }
    }
}