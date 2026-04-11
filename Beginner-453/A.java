import java.util.*;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        String s=sc.nextLine();
        if(s.charAt(0)!='o'){
            System.out.println(s);
        }else{
            int ind=0;
            while(s.charAt(ind)=='o'){
                ind++;
                if(ind==s.length()){
                    break;
                }
            }
            for(;ind<s.length();ind++){
                System.out.print(s.charAt(ind));
            }
        }
    }
    
}