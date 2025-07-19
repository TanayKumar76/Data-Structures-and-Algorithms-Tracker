/*
Problem:Top K Frequent Elements
Given an integer array nums and an integer k, 
return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.
You may return the output in any order.

Example 1:
Input: nums = [1,2,2,3,3,3], k = 2
Output: [2,3]

Example 2:
Input: nums = [7,7], k = 1
Output: [7] 

Optimal Solution: HashMap + Bucket Sort

Time Complexity: O(n) - linear time bucket sort
Space Complexity: O(n) - hashmap + buckets

Alternative: HashMap + Heap

Time Complexity: O(n log k) - maintain heap of size k
Space Complexity: O(n + k) - hashmap + heap

Alternative: HashMap + Sorting

Time Complexity: O(n log n) - sorting by frequency
Space Complexity: O(n) - hashmap
  */
import java.util.*;
public class topk {
    public int[] topkfrequent(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Map.Entry<Integer,Integer>> maplist=new ArrayList<>(map.entrySet());
        maplist.sort((a,b)->b.getValue()-a.getValue());
        int[] sort = new int[k];
        for(int i=0;i<k;i++){
                sort[i]=maplist.get(i).getKey();
            }
            return sort;
        }
    public static void main(String[] args) {
        topk solution = new topk();
        int[] n1 = new int[]{1, 2, 2, 3, 3, 3};
        int[] n2 = new int[]{7, 7};
        
        System.out.println("Test 1: " + Arrays.toString(solution.topkfrequent(n1, 2)));
        System.out.println("Test 2: " + Arrays.toString(solution.topkfrequent(n2, 1)));
    }
}
