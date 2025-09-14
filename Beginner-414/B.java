import java.util.*;

public class B{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long count=0;
		long arr[]=new long[N];
		char chars[] = new char[N];
		for(int index=0; index<N; index++){	
			chars[index]=sc.next().charAt(0);
			arr[index]=sc.nextLong();
			count+=arr[index];
			if(count>100){
				System.out.println("Too Long");
				return;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int index = 0; index < N; index++) {
    			for (long charcount = 0; charcount < arr[index]; charcount++) {
        			sb.append(chars[index]);
    			}
		}
		System.out.println(sb.toString());
		sc.close();
	}
}