import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        int balance = 0;
        int minBalance = 0;
        int q = sc.nextInt();
        Stack<Integer> minStack = new Stack<>();
        minStack.push(0);

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                char c = sc.next().charAt(0);
                if (c == '(') balance++;
                else balance--;
                stack.push(c);
                minBalance = Math.min(minStack.peek(), balance);
                minStack.push(minBalance);
            } else {
                char top = stack.pop();
                minStack.pop();
                if (top == '(') balance--;
                else balance++;
            }

            if (balance == 0 && minStack.peek() >= 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
