import java.util.*;

public class C {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int x = sc.nextInt();
      sc.nextLine();
      String words[] = new String[n];
      for (int ind = 0; ind < n; ind++) {
         words[ind] = sc.nextLine();
      }

      ArrayList<String> set = new ArrayList<>();

      for (int i = 0; i < n; i++) {
         if (k == 1) {
            set.add(words[i]);
            continue;
         }
         for (int j = 0; j < n; j++) {
            if (k == 2) {
               set.add(words[i] + words[j]);
               continue;
            }
            for (int p = 0; p < n; p++) {
               if (k == 3) {
                  set.add(words[i] + words[j] + words[p]);
                  continue;
               }
               for (int q = 0; q < n; q++) {
                  if (k == 4) {
                     set.add(words[i] + words[j] + words[p] + words[q]);
                     continue;
                  }
                  for (int r = 0; r < n; r++) {
                     set.add(words[i] + words[j] + words[p] + words[q] + words[r]);
                  }
               }
            }
         }
      }

      Collections.sort(set);
      System.out.println(set.get(x - 1));
   }
}
