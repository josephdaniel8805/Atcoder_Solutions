import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int ind=1;ind<=n;ind++){
            int temp=(ind*ind*ind);
            if(ind%2==0){
                sum+=temp;
            }   
            else{
                sum-=temp;
            }
        }
        System.out.println(sum);
    }
}
