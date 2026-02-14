// 3. Given a pattern and a string s, find if s follows the same pattern.
// Here follows means a full match, such that there is a bijection between a letter
// in pattern and a non-empty word in s. Specifically:
// Each letter in pattern maps to exactly one unique word in s.
// Each unique word in s maps to exactly one letter in pattern.
// No two letters map to the same word, and no two words map to the same
// letter.
// Example 1:
// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Explanation:
// The bijection can be established as:
// 'a' maps to "dog".
// 'b' maps to "cat".
// Example 2:
// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false
// Example 3:
// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false

import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class Solution{

    public boolean wordPattern(String pattern,String s[])
    {
        if(pattern.length()!=s.length) //if pattern and string length are not equal then returns false
        {
            return false;
        }

        HashMap<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();    
        
        for(int i=0;i<=pattern.length()-1;i++)
        {
            if(map.containsKey(pattern.charAt(i)))//checks if the pattern character is present
            {
                if(!map.get(pattern.charAt(i)).equals(s[i]))//if pattern and string word not equal
                {
                    return false;
                }
            }
            else
            {
                if(set.contains(s[i]))//if equal then we check if string is already used
                    return false;
                {
                    map.put(pattern.charAt(i),s[i]); // else we put the map them and add string in set
                    set.add(s[i]);
                }

            }
        }
        return true;//if everything is correct then returns true
    }

}
public class Main3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pattern:");
        String pattern = sc.nextLine();
        System.out.print("Enter the string:");
        String s[] = sc.nextLine().split(" ");//Split the string into array of strings
        Solution s1 = new Solution();
        System.out.println("OUTPUT:"+s1.wordPattern(pattern,s));//Gives the output
        
        sc.close();
    }

    
}
//javac Main3.java
//java Main3
