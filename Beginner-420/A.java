import java.util.*;
public class A{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int mod=(x+y)%12;
    if(mod==0){
      System.out.println(12);
    }else{
      System.out.println(mod);
    }
    
  }
}