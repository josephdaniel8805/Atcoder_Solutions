import java.util.*;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),Q=sc.nextInt();
        int arr[]= new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0,removed=0;
        while(Q-->0){
            int q=sc.nextInt(),val=sc.nextInt();
            if(q==1){
                int temp=arr[val-1]-removed;
                arr[val-1]++;
                int upd=arr[val-1];
                if(temp==0){
                    count++;
                }
                map.put(upd,map.getOrDefault(upd,0)+1);
                if(count==n){
                    int exactOne=map.getOrDefault(removed+1,0)-map.getOrDefault(removed+2,0);
                    count-=exactOne;
                    removed++;
                }
            }else{
                System.out.println(map.getOrDefault(val+removed, 0));   
            }
            
        }
        
    }
}