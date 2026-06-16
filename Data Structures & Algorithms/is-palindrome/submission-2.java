class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j =s.length() - 1;

        while(i <  j){
            char leftChar = s.charAt(i);
            char rightChar = s.charAt(j);

            if(!Character.isLetterOrDigit(leftChar)){
                i++;
            } else if(!Character.isLetterOrDigit(rightChar)){
                j--;
            }
            else if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            } else{
                i++;
                j--;            
            }
        }
        return true;
    }
}
