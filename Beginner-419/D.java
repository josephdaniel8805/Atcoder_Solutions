import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        String T = sc.nextLine();

        int[] diff = new int[N + 2];
        for (int i = 0; i < M; i++) {
            int L = sc.nextInt(), R = sc.nextInt();
            diff[L - 1] ^= 1;   
            diff[R] ^= 1;        
        }

        StringBuilder result = new StringBuilder();
        int flip = 0;
        for (int i = 0; i < N; i++) {
            flip ^= diff[i];
            if (flip == 0) {
                result.append(S.charAt(i));
            } else {
                result.append(T.charAt(i));
            }
        }

        System.out.println(result.toString());
    }
}
