class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[]= new int[128];   //b-->98 , a-->97, l-->108, o-->111, n-->110
        for(char ch:text.toCharArray()){ 
            freq[ch]++;
        }
        int count=0;
        while(freq[98]>=1 && freq[97]>=1 && freq[108]>=2 && freq[111]>=2 && freq[110]>=1){
            count++;
            freq[98]--;
            freq[97]--;
            freq[108]-=2;
            freq[111]-=2;
            freq[110]--;
        }
        return count;
    }
}