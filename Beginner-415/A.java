import java.util.*;

public class A {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int x = sc.nextInt();
      for (int i = 0; i < n; i++) {
         if (arr[i] == x) {
            System.out.println("Yes");
            return;
         }
      }
      System.out.println("No");
   }
}
