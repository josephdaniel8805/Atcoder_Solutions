import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int [n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        for (int ind=0;ind<n;ind++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[ind]) {
                st.pop();
            }
            if (st.isEmpty()) System.out.println(-1);
            else System.out.println(st.peek()+1);
            st.push(ind);
        }
    }
}
