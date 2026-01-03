import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] freq = new int[N + 1];

        int sq = (int)Math.sqrt(N);

        for (int y = 2; y <= sq; y++) {
            int y2 = y * y;
            for (int x = 1; x < y; x++) {
                int num = y2 + x * x;
                if (num > N) break;
                freq[num]++;
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (freq[i] == 1) count++;
        }

        System.out.println(count);
        for (int i = 1; i <= N; i++) {
            if (freq[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
