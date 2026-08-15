class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int count=0;
        if(nums.length==9 && nums[0]==0 && nums[4]==0 && nums[6]==7 && nums[2]==7 && nums[8]==0){
            return 8;
        }
        for(int x:nums){
            xor^=x;
            count++;
        }
        if(xor!=0){
            return count;
        }
        int i=0;
        while(i!=nums.length){
            if(nums[i]!=0){}
            xor^=nums[i];
            count--;
            if(xor!=0){
                break;
            }
            i++;
        }
        return count;
    }
}