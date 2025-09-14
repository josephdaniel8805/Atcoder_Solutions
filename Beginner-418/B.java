import java.util.*;
public class B{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    double answer=0.0;
    int n=str.length();
    for(int ind=0;ind<n;ind++){
      if(str.charAt(ind)!='t') continue;
      for(int end=ind+2;end<n;end++){
        if(str.charAt(end)!='t') continue;
        int count=0;
        for(int counter=ind;counter<=end;counter++){
          if(str.charAt(counter)=='t') count++;
        }
        if(count>=2){
          double rate=(double)(count-2)/(double)(end-ind-1);
          answer=(answer<rate)? rate : answer;
        }
      }
    }
    
    System.out.printf("%.15f\n", answer);
  }
}