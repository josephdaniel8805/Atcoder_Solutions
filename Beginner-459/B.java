import java.util.*;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        String s=sc.nextLine();
        String words[]=s.split(" ");
        for(String word : words){
            char ch=word.charAt(0);
            if(ch>='a' && ch<='c'){
                System.out.print(2);
            }else if(ch>='d' && ch<='f'){
                System.out.print(3);
            }else if(ch>='g' && ch<='i'){
                System.out.print(4);
            }else if(ch>='j' && ch<='l'){
                System.out.print(5);
            }else if(ch>='m' && ch<='o'){
                System.out.print(6);
            }else if(ch>='p' && ch<='s'){
                System.out.print(7);
            }else if(ch>='t' && ch<='v'){
                System.out.print(8);
            }else{
                System.out.print(9);
            }
        }
    }
}