class Solution {
    public int repeatedNTimes(int[] nums) {
        int max=0;
        for(int x:nums){
            max=Math.max(x,max);
        }
        int freq[]= new int[max+1];
        for(int x:nums){
            freq[x]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==(nums.length)/2){
                return i;
            }
        }
        return -1;
    }
}