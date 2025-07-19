/*
Problem:Group Anagrams
Given an array of strings strs, group all anagrams together into sublists.
You may return the output in any order.

An anagram is a string that contains the exact same characters 
as another string, but the order of the characters can be different.

Example 1:
Input: strs = ["act","pots","tops","cat","stop","hat"]
Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

Example 2:
Input: strs = ["x"]
Output: [["x"]]

Example 3:
Input: strs = [""]
Output: [[""]]
 */
import java.util.*;
public class groupanagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            int[] count=new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(count[i]).append('#');
            }
            String key=sb.toString();
            map.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }
        return new ArrayList<> (map.values());
    }
    public static void main(String[] args) {
        groupanagrams g = new groupanagrams();
        
        String[] test1 = {"act", "pots", "tops", "cat", "stop", "hat"};
        System.out.println("Test 1: " + g.groupAnagrams(test1));
        
        String[] test2 = {"x"};
        System.out.println("Test 2: " + g.groupAnagrams(test2));
        
        String[] test3 = {""};
        System.out.println("Test 3: " + g.groupAnagrams(test3));
    }
}

