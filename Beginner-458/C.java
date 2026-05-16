import java.util.*;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        long ans=0;
        int n=s.length();
        HashSet<Integer> set = new HashSet<>();
        for(int ind=0;ind<n;ind++){
            if(s.charAt(ind)=='C'){
                set.add(ind);
            }
        }
        for(int num : set){
            ans+=(Math.min(n-num-1,num-0)+1);
        }
        System.out.println(ans);
    }
}