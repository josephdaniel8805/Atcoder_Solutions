import java.util.*;

public class B{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    ArrayList<Integer> list=new ArrayList<>();
    for(int ind=0;ind<n;ind++){
      list.add(sc.nextInt());
    }
    for(int ind=0;ind<m;ind++){
      if(list.isEmpty()){
        break;
      }
      int temp=sc.nextInt();
      if(list.contains(temp)){
        list.remove(list.indexOf(temp));
      }
    }
    for(Integer num:list){
        System.out.print(num+" ");
    }
  }
}