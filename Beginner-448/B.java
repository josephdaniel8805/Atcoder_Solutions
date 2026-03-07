import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0;
        for(int ind=1;ind<=m;ind++){
            int c=sc.nextInt();
            map.put(ind,c);
        }
        for(int ind=0;ind<n;ind++){
            int a=sc.nextInt(),b=sc.nextInt();
            if(!map.containsKey(a)){
                continue;
            }
            if(map.getOrDefault(a, 0)>b){
                ans+=(b);
                map.put(a,map.getOrDefault(a, 0)-b);
            }else if(map.getOrDefault(a, 0)>0){
                ans+=(map.getOrDefault(a, 0));
                map.put(a,0);
            }
        }
        System.out.println(ans);
    }
}