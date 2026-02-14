import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),max=0;sc.nextLine();
        String words[]= new String[n];
        for(int ind=0;ind<n;ind++){
            words[ind]=sc.nextLine();
            if(max<words[ind].length()){
                max=words[ind].length();
            }
        }
        for(int ind=0;ind<n;ind++){
            int len=max-words[ind].length();
            if(len==0){
                System.out.println(words[ind]);
            }else{
                for(int ptr=0;ptr<len;ptr++){
                    if(ptr==(len/2)){
                        System.out.print(words[ind]);
                    }
                    System.out.print(".");
                }
                System.out.println();
            }
        }
    }
}