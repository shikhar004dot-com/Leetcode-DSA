class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(x,max);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max){
                count+=max-nums[i];
            }
        }
        return count;
    }
}