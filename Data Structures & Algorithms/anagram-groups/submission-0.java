class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
        {
            new ArrayList();
        }

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (String str : strs)
        {
            char[] chrArray = str.toCharArray();

            Arrays.sort(chrArray);

            String sortedString = new String(chrArray);

            if (!map.containsKey(sortedString))
            {
                map.put(sortedString, new ArrayList<String>());
            }
            
            map.get(sortedString).add(str);
        }

        return new ArrayList(map.values());
    }
}
