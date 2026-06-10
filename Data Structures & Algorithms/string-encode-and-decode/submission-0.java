class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for( String str : strs){
            encoded.append(str.length()).append('#').append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        int currentIndex = 0;
        int len = s.length();

        while(currentIndex < len){
            int delimiter = s.indexOf('#', currentIndex);
            int strLen = Integer.parseInt(s.substring(currentIndex, delimiter));

            int strStart = delimiter + 1;
            int strEnd = strStart + strLen;
            decoded.add(s.substring(strStart, strEnd));

            currentIndex = strEnd;
        }
        return decoded;
    }
}
