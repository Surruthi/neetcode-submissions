class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int maxVolume = Integer.MIN_VALUE;

        while (left < right)
        {
            int leftHeight = heights[left];
            int rightHeight = heights[right];

            int minHeight = Math.min(leftHeight, rightHeight);
            int width = right - left;

            int volume = minHeight * width;

            maxVolume = Math.max(maxVolume, volume);

            if (leftHeight < rightHeight)
            {
                left ++;
            }
            else
            {
                right --;
            }
        }

        return maxVolume;
    }
}
