class Solution {
    public int numberOfSubstrings(String s) {
        int freq[]= new int[3];
        int l=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                ans+=s.length()-i;
                freq[s.charAt(l)-'a']--;
                l++;
            }
        }
        return ans;

    }
}