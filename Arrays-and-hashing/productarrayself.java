/*
Problem:Product of array except self
Given an integer array nums, return an array output where output[i] 
is the product of all the elements of nums except nums[i].

Each product is guaranteed to fit in a 32-bit integer.

O(n) time without using the division operation?

Example 1:
Input: nums = [1,2,4,6]
Output: [48,24,12,8]

Example 2:
Input: nums = [-1,0,1,2,3]
Output: [0,-6,0,0,0]
 */
import java.util.*;
public class productarrayself {
    public int[] productexceptself(int[] nums){
        int[] prefix = new int[nums.length];
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int postfix=1;
        for(int i=nums.length-1;i>=0;i--){
            prefix[i]*=postfix;
            postfix*=nums[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        productarrayself p=new productarrayself();
        int[] n1=new int[]{1,2,4,6};
        int [] n2=new int[]{1,0,1,2,3};
        int[] result1=p.productexceptself(n1);
        int[] result2=p.productexceptself(n2);
        System.out.println("Test 1:"+Arrays.toString(result1));
        System.out.println("Test 2:"+Arrays.toString(result2));
    }
}
