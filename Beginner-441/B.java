import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();sc.nextLine();
        String s=sc.nextLine(),t=sc.nextLine();
        int q=sc.nextInt();sc.nextLine();
        List<Character> Tak= new ArrayList<>();
        List<Character> Aok= new ArrayList<>();
        for(int ind=0;ind<s.length();ind++){
            Tak.add(s.charAt(ind));
        }
        for(int ind=0;ind<t.length();ind++){
            Aok.add(t.charAt(ind));
        }
        while(q-->0){
            String temp=sc.nextLine();
            boolean Takahashi=true,Aoki=true;
            for(int ind=0;ind<temp.length();ind++){
                char ch=temp.charAt(ind);
                if(!Tak.contains(ch)){
                    Takahashi=false;
                }
                if(!Aok.contains(ch)){
                    Aoki=false;
                }
            }
            if(Takahashi && Aoki){
                System.out.println("Unknown");
            }else if(Takahashi){
                System.out.println("Takahashi");
            }else if(Aoki){
                System.out.println("Aoki");
            }else{
                System.out.println("Unknown");
            }
        }
    }
}
