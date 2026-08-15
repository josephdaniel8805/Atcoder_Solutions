import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),pos=0;
        long ans=0;
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int ind=0;ind<n;ind++){
            int temp=sc.nextInt();
            if(temp<0){
                maxheap.add(temp);
            }else{
                minheap.add(temp);
            }
        }
        while(!maxheap.isEmpty() && !minheap.isEmpty()){
            int min=maxheap.peek(),max=minheap.peek();
            if(pos<0){
                if(Math.abs(min-pos)>Math.abs(max-pos)){
                    ans+=Math.abs(max-pos);
                    pos=max;
                    minheap.poll();
                }else{
                    ans+=Math.abs(min-pos);
                    pos=min;
                    maxheap.poll();
                }
            }else{
                if(Math.abs(min-pos)>Math.abs(max-pos)){
                    ans+=Math.abs(max-pos);
                    pos=max;
                    minheap.poll();
                }else{
                    ans+=Math.abs(min-pos);
                    pos=min;
                    maxheap.poll();
                }
            }
            //System.out.println(pos+" "+Math.abs(pos+min)+" "+Math.abs(pos-max)+" "+ans);
        }
        while(!maxheap.isEmpty()){
            int min=maxheap.peek();
            if(pos<0){
                ans+=Math.abs(min-pos);
                pos=min;
                maxheap.poll();
            }else{
                ans+=Math.abs(min-pos);
                pos=min;
                maxheap.poll();
            }        
            //System.out.println(pos+" "+Math.abs(pos+min)+" "+Math.abs(pos-min)+" "+ans);
        }
        while(!minheap.isEmpty()){
            int max=minheap.peek();
            if(pos<0){
                ans+=Math.abs(max-pos);
                pos=max;
                minheap.poll();        
            }else{
                ans+=Math.abs(max-pos);
                pos=max;
                minheap.poll();
            }   
            //System.out.println(pos+" "+Math.abs(pos+max)+" "+Math.abs(pos-max)+" "+ans);
        }
        System.out.println(ans);
    }     
}