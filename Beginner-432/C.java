import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long D = Y - X;

        long[] A = new long[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextLong();

        long modVal = (A[0] * X) % D;
        long L = A[0] * X;
        long R = A[0] * Y;

        for (int i = 1; i < N; i++) {
            if ((A[i] * X) % D != modVal) {
                System.out.println(-1);
                return;
            }
            L = Math.max(L, A[i] * X);
            R = Math.min(R, A[i] * Y);
        }

        if (L > R) {
            System.out.println(-1);
            return;
        }

        long W = R - ( (R - modVal) % D );
        if (W < L) {
            System.out.println(-1);
            return;
        }

        long totalLarge = 0;
        for (int i = 0; i < N; i++) {
            totalLarge += (W - A[i] * X) / D;
        }

        System.out.println(totalLarge);
    }
}
