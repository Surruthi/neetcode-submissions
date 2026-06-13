class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> elements = new HashSet<Integer>();

        for(int num : nums)
        {
            if(! elements.add(num))
            {
                return true;
            }
        }

        return false;
    }
}