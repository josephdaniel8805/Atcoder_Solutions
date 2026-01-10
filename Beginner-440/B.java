import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int ind=0;ind<n;ind++){
            int temp=sc.nextInt();
            map.put(temp,ind+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getValue()+" ");
            count++;
            if(count==3){
                break;
            }
        }
    }
}
