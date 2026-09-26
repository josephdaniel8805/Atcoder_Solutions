import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n=sc.nextInt(),d=sc.nextInt();
        int arr[] = new int[n];
        int sorted[] = new int[n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextInt();
            pq.add(arr[ind]);
        }
        for(int ind=0;ind<n;ind++){
            sorted[ind]=pq.poll();
        }
        HashSet<Integer> result = new HashSet<>();
        for(int ind=0;ind<n;ind++){
            boolean valid=true;
            if(ind>0){
                if(sorted[ind-1]>(sorted[ind]-d)){
                    valid=false;
                }
            }
            if(ind<n-1){
                if(sorted[ind]>(sorted[ind+1]-d)){
                    valid=false;
                }
            }
            if(valid){
                result.add(sorted[ind]);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int ind=0;ind<n;ind++){
            if(result.contains(arr[ind])){
                ans.add(ind+1);
            }
        }
        System.out.println(ans.size());
        for(int num : ans){
            System.out.print(num+" ");
        }
    }     
}