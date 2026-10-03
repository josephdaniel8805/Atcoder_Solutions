import java.util.*;

public class D {
     static class Interval{
        int l,r;
        Interval(int l, int r){
            this.l = l;
            this.r = r;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),Q=sc.nextInt();
        List<Interval>[] intervals = new ArrayList[Q+1];
        for(int ind=1;ind<=Q;ind++){
            intervals[ind] = new ArrayList<>();
        }
        for(int ind=0;ind<Q;ind++){
            int l=sc.nextInt(),r=sc.nextInt(),x=sc.nextInt();
            intervals[x].add(new Interval(l,r));
        }
        int[] diff = new int[N+2];
        for(int x=1;x<=Q;x++){
            if(intervals[x].isEmpty()){
                continue;
            }
            intervals[x].sort((a, b)->{
                if(a.l!=b.l){
                    return Integer.compare(a.l,b.l);
                }
                return Integer.compare(a.r,b.r);
            });
            int left=intervals[x].get(0).l,right=intervals[x].get(0).r;
            for (int ind=1;ind<intervals[x].size();ind++) {
                Interval cur = intervals[x].get(ind);
                if(cur.l<= right+1){
                    right=Math.max(right,cur.r);
                }else{
                    diff[left]++;
                    diff[right+1]--;
                    left=cur.l;
                    right=cur.r;
                }
            }
            diff[left]++;
            diff[right+1]--;
        }
        int current=0;
        for(int ind=1;ind<=N;ind++){
            current+=diff[ind];
            if(ind>1){
                System.out.print(" ");
            }
            System.out.print(current);
        }
        System.out.println();
    }
}