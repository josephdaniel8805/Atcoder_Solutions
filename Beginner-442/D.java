import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),q=sc.nextInt();
        int arr[]= new int[n];
        int pref[]= new int[n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextInt();
            if(ind==0){
                pref[ind]=arr[ind];
            }else{
                pref[ind]=(arr[ind]+pref[ind-1]);
            }
        }
        while(q-->0){
            int qu=sc.nextInt();
            if(qu==1){
                int x=sc.nextInt();
                int temp=arr[x];
                pref[x]-=arr[x];
                pref[x]-=arr[x-1];
                pref[x-1]-=arr[x-1];
                arr[x]=arr[x-1];
                arr[x-1]=temp;
                pref[x]+=(arr[x-1]+arr[x]);
                pref[x-1]+=arr[x-1];
            }else{
                int l=sc.nextInt(),r=sc.nextInt();
                if((l-2)<0){
                    System.out.println(pref[r-1]);
                    continue;
                }
                System.out.println(pref[r-1]-pref[l-2]);
            }
        }
    }
}
