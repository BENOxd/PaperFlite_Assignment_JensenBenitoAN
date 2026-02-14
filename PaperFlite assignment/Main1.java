// 1. Given a non-empty array of integers nums, every element appears twice
// except for one.Find that single one.
// Example 1:
// Input: nums = [2,2,1]
// Output: 1
// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4
// Example 3:
// Input: nums = [1]
// Output: 1

import java.util.Scanner;

class Solution {
public int singleNumber(int[] nums) {
    int result = 0;
    if(nums.length==1)
    {
        return nums[0];
    }
    for(int nums1 : nums)
    {
        result ^=nums1; //I use XOR because it returns duplicate integers as 0 and unique integer as same
    }

    return result;
}
}
class Main1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the odd number of integers:");//Enter odd array size
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Only Odd length is valid");//Error if even number of integers are entered
            sc.close();
            return;
        }
        int nums[] = new int[n];
        for(int i=0;i<=n-1;i++)
        {
            System.out.println("Enter the Integers:");//Enter the integers
            nums[i]=sc.nextInt();
        }
        Solution s = new Solution();//Create a object for the class Solution
        System.out.println("OUTPUT:"+s.singleNumber(nums));//Prints the output
        sc.close();
    }
}

//Run javac Main1.java
//Run java Main1