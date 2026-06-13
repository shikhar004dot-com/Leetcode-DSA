class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int sum=0;
            for(int j=0;j<s.length();j++){
                sum+=weights[s.charAt(j)-'a'];
            }
            ans+=ascii(sum%26);
        }
        return ans;
    }
    public static char ascii(int x){
        return (char)(122-x);
        
    }

}