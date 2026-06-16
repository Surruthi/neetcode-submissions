class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        for (int num : nums)
        {
            frequencyMap.put(Integer.valueOf(num), frequencyMap.getOrDefault(Integer.valueOf(num), 0) + 1); 
        }

        List<Integer> numbers = new ArrayList<>(frequencyMap.keySet());

        numbers.sort((a,b) -> frequencyMap.get(b) - frequencyMap.get(a));

        int result[] = new int [k];
        
        for (int i = 0; i < k; i++)
        {
            result[i] = numbers.get(i);
        }
    
        return result;
    }
}
