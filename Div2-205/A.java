import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), Q = sc.nextInt();
        char[][] grid = new char[N][N];
        
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        int[][] good = new int[N][N]; 
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1; j++) {
                if (grid[i][j]=='.' && grid[i+1][j]=='.' &&
                    grid[i][j+1]=='.' && grid[i+1][j+1]=='.') {
                    good[i][j] = 1;
                }
            }
        }

        int[][] pref = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                pref[i][j] = good[i][j];
                if (i > 0) pref[i][j] += pref[i-1][j];
                if (j > 0) pref[i][j] += pref[i][j-1];
                if (i > 0 && j > 0) pref[i][j] -= pref[i-1][j-1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < Q; q++) {
            int U = sc.nextInt()-1;
            int D = sc.nextInt()-1;
            int L = sc.nextInt()-1;
            int R = sc.nextInt()-1;

            int r1 = U, r2 = D-1;
            int c1 = L, c2 = R-1;
            if (r1 > r2 || c1 > c2) {
                System.out.println(0);
                continue;
            }

            int ans = pref[r2][c2];
            if (r1 > 0) ans -= pref[r1-1][c2];
            if (c1 > 0) ans -= pref[r2][c1-1];
            if (r1 > 0 && c1 > 0) ans += pref[r1-1][c1-1];

            System.out.println(ans);
        }

        System.out.print(sb);
    }
}
