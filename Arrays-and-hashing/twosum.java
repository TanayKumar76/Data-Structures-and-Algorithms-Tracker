/*
Problem:Two Sum
Given an array of integers nums and an integer target, 
return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of 
indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 1:
Input: 
nums = [3,4,5,6], target = 7
Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

Example 2:
Input: nums = [4,5,6], target = 10
Output: [0,2]

Example 3:
Input: nums = [5,5], target = 10
Output: [0,1] */
import java.util.*;
public class twosum {
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }else{
            map.put(nums[i],i);
            }
        }
        return new int[] {};
    }
    public static void main(String[] args){
        twosum s=new twosum();
        
        int[] result1 = s.twoSum(new int[]{3, 4, 5, 6}, 7);
        System.out.println("Test 1: " + Arrays.toString(result1));
        
        int[] result2 = s.twoSum(new int[]{4, 5, 6}, 10);
        System.out.println("Test 2: " + Arrays.toString(result2));
    
        int[] result3 = s.twoSum(new int[]{5, 5}, 10);
        System.out.println("Test 3: " + Arrays.toString(result3));
        

    }


}
