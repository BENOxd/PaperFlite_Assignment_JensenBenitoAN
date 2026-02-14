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
