import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<int[]> stack = new Stack<>();
        int n=sc.nextInt();
        for(int ind=0;ind<n;ind++){
            int temp=sc.nextInt();
            if(!stack.isEmpty() && stack.peek()[0]==temp){
                stack.peek()[1]++;
            }else{
                stack.push(new int[]{temp,1});
            }
            while(!stack.isEmpty() && stack.peek()[1]>3){
                stack.pop();
            }
        }
        int ans=0;
        for(int[] p : stack){
            ans+=p[1];
        }
        System.out.println(ans);
    }
}