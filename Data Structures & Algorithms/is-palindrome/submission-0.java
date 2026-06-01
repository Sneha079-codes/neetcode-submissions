class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                clean.append(Character.toLowerCase(ch));
            }
        }

        String str = clean.toString();
        int left = 0;
        int right = str.length() - 1;

        while(left< right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
