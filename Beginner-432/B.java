import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),zero=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0){
            if(n%10!=0){
                list.add(n%10);
            }else{
                zero++;
            }
            n/=10;
        }
        Collections.sort(list);
        for(int ind=0;ind<list.size();ind++){
            if(ind==1){
                while(zero!=0){
                    System.out.print(0);
                    zero--;
                }
                System.out.print(list.get(ind));
            }else{
                System.out.print(list.get(ind));
            }
        }
        while(zero!=0){
            System.out.print(0);
            zero--;
        }
    }
}
