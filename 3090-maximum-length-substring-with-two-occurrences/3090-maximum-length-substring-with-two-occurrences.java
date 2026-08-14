class Solution {
    public int maximumLengthSubstring(String s) {
        int arr[]= new int[28];
        int left=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            arr[idx]++;
            while(arr[idx]>2){
                arr[s.charAt(left)-'a']--;
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}