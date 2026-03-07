import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),q=sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ind=1;ind<=n;ind++){
            int a=sc.nextInt();
            map.put(ind,a);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> a, Map.Entry<Integer,Integer> b){
                return a.getValue().compareTo(b.getValue());
            }
        });
        HashMap<Integer,Integer> sortedmap = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry : list){
            sortedmap.put(entry.getKey(),entry.getValue());
        }
        for(int ind=0;ind<q;ind++){
            int qsize=sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            int ans=0;
            for(int ptr=0;ptr<qsize;ptr++){
                int qu=sc.nextInt();
                set.add(qu);
            }
            for(Map.Entry<Integer,Integer> entry : sortedmap.entrySet()){
                if(!set.contains(entry.getKey())){
                    ans=entry.getValue();
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}