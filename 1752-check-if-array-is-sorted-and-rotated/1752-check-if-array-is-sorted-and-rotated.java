class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int x=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+x)%nums.length]){
                count++;
            }
        }
        return (count<=1)?true:false;
    }
}