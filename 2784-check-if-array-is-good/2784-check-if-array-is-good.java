class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=i+1){
                return false;
            }
        }
        int n=nums.length-1;
        if(nums[n]==n && nums[n-1]==n){
            return true;
        }
        else{
            return false;
        }
    }
}