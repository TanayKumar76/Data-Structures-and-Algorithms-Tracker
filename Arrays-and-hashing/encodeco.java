/*
Problem:Encode and Decode Strings
Design an algorithm to encode a list of strings to a single string.
The encoded string is then decoded back to the original list of strings.
Please implement encode and decode

Example 1:
Input: ["neet","code","love","you"]
Output:["neet","code","love","you"]

Example 2:
Input: ["we","say",":","yes"]
Output: ["we","say",":","yes"]

Optimal Solution: Length prefix encoding (e.g., "4#word5#hello")

Encode Time Complexity: O(n) - where n is total characters in all strings
Decode Time Complexity: O(n) - single pass through encoded string
Space Complexity: O(n) - store encoded string

Alternative: Delimiter-based (if no special characters in strings)

Encode Time Complexity: O(n)
Decode Time Complexity: O(n)
Space Complexity: O(n)
 */
import java.util.*;
public class encodeco {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }
    public List<String> decode(String str) {
        List <String> result = new ArrayList<>();

        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            j++;
            String word = str.substring(j,j+length);
            result.add(word);     
            i=j+length;       
        }
        return result;
    }
    public static void main(String[] args){
        encodeco codec=new encodeco();
        List<String> input1 = Arrays.asList("neet", "code", "love", "you");
        String encoded1 = codec.encode(input1);
        List<String> decoded1 = codec.decode(encoded1);
        
        System.out.println("=== Test Case 1 ===");
        System.out.println("Original: " + input1);
        System.out.println("Encoded:  " + encoded1);
        System.out.println("Decoded:  " + decoded1);
        System.out.println("Match: " + input1.equals(decoded1));
        
 
        List<String> input2 = Arrays.asList("we", "say", ":", "yes");
        String encoded2 = codec.encode(input2);
        List<String> decoded2 = codec.decode(encoded2);
        
        System.out.println("\n=== Test Case 2 ===");
        System.out.println("Original: " + input2);
        System.out.println("Encoded:  " + encoded2);
        System.out.println("Decoded:  " + decoded2);
        System.out.println("Match: " + input2.equals(decoded2));
        

        List<String> input3 = Arrays.asList("", "a", "##", "hello#world");
        String encoded3 = codec.encode(input3);
        List<String> decoded3 = codec.decode(encoded3);
        
        System.out.println("\n=== Test Case 3 (Edge Cases) ===");
        System.out.println("Original: " + input3);
        System.out.println("Encoded:  " + encoded3);
        System.out.println("Decoded:  " + decoded3);
        System.out.println("Match: " + input3.equals(decoded3));
        
 
        List<String> input4 = new ArrayList<>();
        String encoded4 = codec.encode(input4);
        List<String> decoded4 = codec.decode(encoded4);
        
        System.out.println("\n=== Test Case 4 (Empty List) ===");
        System.out.println("Original: " + input4);
        System.out.println("Encoded:  '" + encoded4 + "'");
        System.out.println("Decoded:  " + decoded4);
        System.out.println("Match: " + input4.equals(decoded4));
        
       
        List<String> input5 = Arrays.asList("123", "4567890", "1#2#3");
        String encoded5 = codec.encode(input5);
        List<String> decoded5 = codec.decode(encoded5);
        
        System.out.println("\n=== Test Case 5 (Numbers and Special Chars) ===");
        System.out.println("Original: " + input5);
        System.out.println("Encoded:  " + encoded5);
        System.out.println("Decoded:  " + decoded5);
        System.out.println("Match: " + input5.equals(decoded5));
    }
}


