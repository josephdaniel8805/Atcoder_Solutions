import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); 
        int k=sc.nextInt();sc.nextLine();
        String s=sc.nextLine();
        int max=0;
        TreeMap<String,Integer> map=new TreeMap<>();
        for(int ind=k;ind<=s.length();ind++){
            String temp=s.substring(ind-k,ind);
            map.put(temp,map.getOrDefault(temp,0)+1);
            max=Math.max(max,map.getOrDefault(temp,0));
        }
        System.out.println(max);
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()==max){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    
}
