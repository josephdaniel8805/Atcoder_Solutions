import java.util.*;

public class A{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int L=sc.nextInt();
		int R=sc.nextInt();
		int count=0;
		int arr[][]=new int[N][2];
		for(int index=0; index<N; index++){	
			arr[index][0]=sc.nextInt();
			arr[index][1]=sc.nextInt();
			if(arr[index][0]<=L && arr[index][1]>=R) count++;
		}
		System.out.println(count);
		sc.close();
	}
}