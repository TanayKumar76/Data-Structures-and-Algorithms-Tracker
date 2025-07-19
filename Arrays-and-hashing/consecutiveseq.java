/*
Problem:Longest consecutive sequence
Given an array of integers nums, return the length of the
longest consecutive sequence of elements that can be formed.

A consecutive sequence is a sequence of elements in which each
element is exactly 1 greater than the previous element. 
The elements do not have to be consecutive in the original array.

You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [2,20,4,10,3,4,5]
Output: 4

Explanation: The longest consecutive sequence is [2, 3, 4, 5].

Example 2:
Input: nums = [0,3,2,5,4,6,1,1]
Output: 7
 */

import java.util.*;
public class consecutiveseq {
    public int longestconseq(int[] nums){
        Set<Integer> nset=new HashSet<>();
        for(int n:nums){
            nset.add(n);
        }
        int longest=1;
        for(int n:nset){
            if(!nset.contains(n-1)){
                int currentnum=n;
                int currentstreak=1;
            while(nset.contains(currentnum+1)){
                currentstreak+=1;
                currentnum+=1;
            }
            longest=Math.max(longest,currentstreak);
        }
    }
    return longest;
    }
    public static void main(String[] args) {
        consecutiveseq c=new consecutiveseq();
        int[] n1=new int[]{2,20,4,10,3,4,5};
        int[] n2=new int[]{0,3,2,5,4,6,1,1};
        System.out.println("Test 1:"+c.longestconseq(n1));
        System.out.println("Test 2:"+c.longestconseq(n2));

    }
}
