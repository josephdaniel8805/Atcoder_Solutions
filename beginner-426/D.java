import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();sc.nextLine();
        String s=sc.nextLine();
        int zero=0,one=0;
        ArrayList<Integer> zlist = new ArrayList<>();
        ArrayList<Integer> olist = new ArrayList<>();
        boolean flag=false;
        int temp=0;
        for(int ind=0;ind<n;ind++){
            char ch=s.charAt(ind);
            if(ch=='0'){
                if(flag){
                    olist.add(temp);
                    temp=0;
                }
                zero++;
                temp++;
                flag=false;
            }else{
                if(!flag){
                    zlist.add(temp);
                    temp=0;
                }
                one++;
                temp++;
                flag=true;
            }
        }
        if(!flag){
            zlist.add(temp);
            temp=0;
        }
        if(flag){
            olist.add(temp);
            temp=0;
        }
        int ans=Integer.MAX_VALUE;
        for(int num : olist){
            ans=Math.min(ans,(((one-num)*2)+zero));
        }
        for(int num : zlist){
            ans=Math.min(ans,(((zero-num)*2)+one));
        }
        System.out.println(ans);
        }      
    }
}
