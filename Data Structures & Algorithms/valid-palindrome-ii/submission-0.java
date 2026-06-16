class Solution {
    private char[] charArray;
    public boolean validPalindrome(String s) {
        this.charArray = s.toCharArray();

        int i =0; 
        int j = s.length() - 1;

        while(i < j){
            if(charArray[i] != charArray[j]){
                return isPalindrome(i+1, j) || isPalindrome(i, j-1);
            }
            i++; j--;
        }
        return true;
    }
    private boolean isPalindrome(int i, int j){
        while(i < j){
            if(charArray[i] != charArray[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}