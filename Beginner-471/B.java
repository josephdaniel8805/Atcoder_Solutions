import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        int count=0;
        HashMap<String,Integer> map = new HashMap<>();
        for(int ind=0;ind<n;ind++){
            String s=sc.nextLine();
            int len=s.length();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<len;i++){
                char ch=s.charAt(i);
                if(ch<'a'){
                    sb.append((char)(ch+32));
                }else{
                    sb.append(ch);
                }

            }
            String s1= new String(sb.toString());
            map.put(s1,map.getOrDefault(s1,0)+1);
            count=((map.getOrDefault(s1, 0))>count)?map.getOrDefault(s1,0):count;
        }   
        System.out.println(count);
    }     
}