class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
           String a=words[i];
           if(pal(a)){
                return a;
           }
        }
        return "";
    }
    public static boolean pal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}