import java.util.*;

public class A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();

    System.out.println(s.substring(a, n - b));
  }
}
