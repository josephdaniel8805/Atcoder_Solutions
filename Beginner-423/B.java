import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        boolean visited[]= new boolean[n];
        int count=0;
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextInt();
        }
        for(int ind=0;ind<n;ind++){
            if(arr[ind]==0){
                visited[ind]=true;
            }else{
                break;
            }
        }
        for(int ind=n-1;ind>=0;ind--){
            if(arr[ind]==0){
                visited[ind]=true;
            }else{
                visited[ind]=true;
                break;
            }
        }
        for(int ind=n-1;ind>=0;ind--){
            if(visited[ind]==false){
                count++;
            }
        }
        System.out.println(count);
    }
}
