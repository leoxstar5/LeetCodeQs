import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        int[] list = new int[] {2, 7, 11, 15};
        int[] result = Solution.twoSum(list, 9);
        System.out.println(Arrays.toString(result));

        System.out.println(Solution.isPalindrome(898));
        System.out.println(Solution.isPalindrome(298892));
    }
}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                // don't compare the same index
                if (i != j)
                {
                    if (nums[i] + nums[j] == target)
                    {
                        result = new int[]{i, j};
                        return result;
                    }
                }
            }
        }
        
        return result;
    }

    public static boolean isPalindrome(int x) {
        String xStr = Integer.toString(x);

        // iterate from either end
        for(int i = 0, j = xStr.length() - 1; i < xStr.length() && j >= 0; i++, j--)
        {
            if (xStr.charAt(i) != xStr.charAt(j))
            {
                return false;
            }
        }

        return true;
    }
}