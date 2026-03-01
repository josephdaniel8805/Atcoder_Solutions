import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[26];
        int max=0;
        String s=sc.nextLine();
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
            max=(max<arr[ch-'a'])?arr[ch-'a']:max;
        }
        for(char ch : s.toCharArray()){
            if(max!=arr[ch-'a']){
                System.out.print(ch);
            }
        }
    }
}