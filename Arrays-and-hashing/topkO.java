import java.util.*;
public class topkO {
    public int[] topkOFrequent(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap= new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size()>k){
            minHeap.poll();}
        }
        int[] result = new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            result[i++]=minHeap.poll().getKey();
        }
return result;
        }
    public static void main(String[] args) {
        topkO solution = new topkO();
        int[] n1 = new int[]{1, 2, 2, 3, 3, 3};
        int[] n2 = new int[]{7, 7};
        
        System.out.println("Test 1: " + Arrays.toString(solution.topkOFrequent(n1, 2)));
        System.out.println("Test 2: " + Arrays.toString(solution.topkOFrequent(n2, 1)));
    }
}



