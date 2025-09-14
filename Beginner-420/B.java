import java.util.*;

public class B {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt(); 
      sc.nextLine();

      int[] one = new int[m];
      int[] zero = new int[m];
      String[] people = new String[n];

      for(int ind = 0; ind < n; ind++){
         String temp = sc.nextLine();
         people[ind] = temp; 
         for(int j = 0; j < m; j++){
            if(temp.charAt(j) == '1'){
               one[j]++;
            } else {
               zero[j]++;
            }
         }
      }

      char[] minority = new char[m];
      for(int j = 0; j < m; j++){
         if(one[j] == 0) minority[j] = '0';  
         else if(zero[j] == 0) minority[j] = '1'; 
         else if(one[j] <= zero[j]) minority[j] = '1';
         else minority[j] = '0';
      }
      int score[]= new int[n];
      int max=0;
      for(int ind = 0; ind < n; ind++){
         for(int j = 0; j < m; j++){
            if(people[ind].charAt(j) == minority[j]) score[ind]++;
         }
         max=Math.max(max,score[ind]);
      }
      for(int ind=0;ind <n;ind++){
         if(max==score[ind]){
            System.out.print((ind+1)+" ");
         }
      }
   }
}
