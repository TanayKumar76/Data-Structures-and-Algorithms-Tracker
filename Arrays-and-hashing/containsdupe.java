/*
Problem: Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Time Complexity: O(n)
Space Complexity: O(n)
*/
import java.util.*;
public class containsdupe {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!seen.contains(nums[i])){
                seen.add(nums[i]); 
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        containsdupe s = new containsdupe();

        int[] nums1={1,2,3,4};
        int[] nums2={1,1,2,2,3,3,3,4};
        int[] nums3={};

        System.out.println("Test 1:"+s.containsDuplicate(nums1));
        System.out.println("Test 2:"+s.containsDuplicate(nums2));
        System.out.println("Test 3:"+s.containsDuplicate(nums3));
    }
}
