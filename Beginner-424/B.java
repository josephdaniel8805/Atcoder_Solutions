import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),p=sc.nextInt(),k=sc.nextInt();
        HashMap<Integer,ArrayList<Integer>> list = new HashMap<>();
        for(int ind=0;ind<k;ind++){
            int per=sc.nextInt();
            int prob=sc.nextInt();
            list.putIfAbsent(per, new ArrayList<>());
            list.get(per).add(prob);
            if(list.get(per).size()==p){
                System.out.print(per+" ");
            }
        }
    }
}
