import java.util.*;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        long n=sc.nextLong();
        long ans=0;
        for(int len=1;len<=12;len++){
            int half=(len+1)/2;
            long start=(long)Math.pow(10,half-1);
            long end=(long)Math.pow(10,half)-1;
            if(len==1) start=1; 
            String rev;
            for(long ind=start;ind<=end;ind++){
                String s=Long.toString(ind);
                if(len%2==0){
                    rev= new StringBuilder(s).reverse().toString();
                }else{  
                    rev= new StringBuilder(s.substring(0,s.length()-1)).reverse().toString();
                }
                long num=Long.parseLong(s+rev);
                if(num>n){
                    break;
                }
                if(ispaly(tobase(num,a))){
                    ans+=num;
                }
            }        
        }
        System.out.println(ans);
    }
    public static boolean ispaly(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
    public static String tobase(long num, int base){
        StringBuilder result = new StringBuilder();
        while(num>0){
            result.append(num%base);
            num/=base;
        }
        return result.reverse().toString();
    }
}