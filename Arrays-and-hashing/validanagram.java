/*
Problem:Valid Anagram
Given two strings s and t, return true if the two strings are anagrams of 
each other, otherwise return false.

An anagram is a string that contains the exact same characters 
as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"
Output: true

Example 2:

Input: s = "jar", t = "jam"
Output: false

Optimal Solution: Character frequency count using HashMap/array

Time Complexity: O(n) - where n is length of strings
Space Complexity: O(1) - constant space for 26 lowercase letters (or O(k) for k unique characters)

Alternative: Sort both strings

Time Complexity: O(n log n) - sorting
Space Complexity: O(1) - if sorting in-place
 */
import java.util.*;
public class validanagram {
    public boolean validAnagram(String s,String t){
        HashMap<Character,Integer> maps=new HashMap<>();
        HashMap<Character,Integer> mapt=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        char[] S=s.toCharArray();
        char[] T=t.toCharArray();
        for(char c:S){
            maps.put(c,maps.getOrDefault(c,0)+1);
        }
        for(char c:T){
            mapt.put(c,mapt.getOrDefault(c,0)+1);
        }
        if(maps.equals(mapt)){
            return true;
        }else{
        return false;
    }    }
    public static void main(String[] args){
        validanagram a=new validanagram();
        System.out.println("Test 1:"+a.validAnagram("racecar","carrace"));
        System.out.println("Test 2:"+a.validAnagram("jar","jam"));
    }
}
