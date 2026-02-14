// 2. Given string num representing a non-negative integer num, and an
// integer k, return the smallest possible integer after removing k digits from
// num.
// Example 1:
// Input: num = "1432219", k = 3
// Output: "1219"
// Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219
// which is the smallest.
// Example 2:
// Input: num = "10200", k = 1
// Output: "200"
// Explanation: Remove the leading 1 and the number is 200. Note that the
// output must not contain leading zeroes.
// Example 3:
// Input: num = "10", k = 2
// Output: "0"

// Explanation: Remove all the digits from the number and it is left with nothing
// which is 0.

import java.util.Scanner;
import java.util.Stack;
class Solution {
public String removeKdigits(String num, int k) {
    if(num.length()==k)//cancels all the digits if k is equal to number of digits
    {
        return "0";
    }
    Stack<Character> st = new Stack<>();
    for(int i=0;i<=num.length()-1;i++)
    {
        while(st.size()>0 && st.peek()>num.charAt(i) && k>0) //Top of stack is greater than current character and 
        {                                                    //k is greater than 0 then we pop the stack
            st.pop();
            k--;
        }
        st.push(num.charAt(i));//Push to stack if above condition is not satisfied
    }

    StringBuilder sb = new StringBuilder();
    while(!st.isEmpty())
    {
        sb.append(st.pop());//Append the stack elements 
    }
    sb.reverse();
    while(sb.length()>0 && sb.charAt(0)=='0')//Remove the leading zeros since zero is not valid
    {
        sb.deleteCharAt(0);
    }
    return sb.toString();
}
}
class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String num = sc.nextLine();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        Solution s = new Solution();
        System.out.println("OUTPUT:"+s.removeKdigits(num,k));//Prints the output
        sc.close();
        
    }
}