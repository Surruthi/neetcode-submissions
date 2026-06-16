class Solution {

    public String encode(List<String> strs) {

        StringBuilder encodedString = new StringBuilder();

        for(String str : strs)
        {
            encodedString.append(str.length());
            encodedString.append("#");
            encodedString.append(str);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<String>();

        int i = 0;

        while (i < str.length())
        {
            int index = str.indexOf("#", i);
            int strLength = Integer.parseInt(str.substring(i, index));

            int start = index + 1;
            int end = start + strLength;

            result.add(str.substring(start, end));

            i = end;
        }

        return result;
    }
}
