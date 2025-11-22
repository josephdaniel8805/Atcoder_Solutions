import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        int prevCount = 0;
        int curCount = 1;
        int prevDigit = -1;
        int curDigit = s.charAt(0) - '0';
        for(int ind = 1; ind < s.length(); ind++){
            int x = s.charAt(ind) - '0';
            if(x == curDigit){
                curCount++;
            } else {
                if(prevDigit + 1 == curDigit){
                    ans += Math.min(prevCount, curCount);
                }
                prevDigit = curDigit;
                prevCount = curCount;
                curDigit = x;
                curCount = 1;
            }
        }
        if(prevDigit + 1 == curDigit){
            ans += Math.min(prevCount, curCount);
        }
        System.out.println(ans);
    }
}
