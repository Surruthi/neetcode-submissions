class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int output[] = new int[nums.length];

        int total = 1;

        for (int num : nums)
        {
            total = total * num;
        }

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                output[i] = total / nums[i];
            }
            else
            {
                output[i] = findProductExceptZero(nums, i);
            }
        }

        return output;
    }

    private int findProductExceptZero(int[] nums, int k)
    {
        int total = 1;

        for (int i = 0; i < nums.length; i++)
        {
            if( i != k)
            {
                total = total * nums[i];
            }
        }

        return total;
    }
}  
