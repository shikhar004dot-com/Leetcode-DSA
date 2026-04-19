class Solution {
    public int smallestEqual(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                // min=Math.min(i,min);
                return i;
            }
        }
        return -1;
    }
}