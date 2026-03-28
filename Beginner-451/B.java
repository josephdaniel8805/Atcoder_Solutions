import java.util.*;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int afreq[] = new int[101];
        int bfreq[] = new int[101];
        for(int ind=0;ind<n;ind++){
            afreq[sc.nextInt()]++;
            bfreq[sc.nextInt()]++;
        }
        for(int ind=1;ind<=m;ind++){
            System.out.println(bfreq[ind]-afreq[ind]);
        }
    }
}