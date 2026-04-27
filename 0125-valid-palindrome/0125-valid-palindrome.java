class Solution {
    public boolean isPalindrome(String s) {
        String a=s.toLowerCase();
        String t="";
        for(int i=0;i<a.length();i++){
            if(Character.isLetterOrDigit(a.charAt(i))){
                t+=a.charAt(i);
            }
            else{
                continue;
            }
        }
        return palindrome(t);   
    }
    public static boolean palindrome(String t){
        int i=0;
        int j=t.length()-1;
        while(i<=j){
            if(t.charAt(i)!=t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}