import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),max=1;
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextInt();
            if(map.isEmpty()){
                map.put(arr[ind],1);
            }else{
                if(map.containsKey(arr[ind]-1)){
                    map.put(arr[ind],map.getOrDefault(arr[ind]-1, 0)+1);
                    if(max<map.getOrDefault(arr[ind], 0)){
                        max=map.getOrDefault(arr[ind], 0);
                    }
                }else{
                    map.put(arr[ind],1);
                }
            }
        }
        System.out.println(max);
        
    }
}