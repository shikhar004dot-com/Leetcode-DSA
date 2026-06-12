class Solution {
    public int findMiddleIndex(int[] nums) {
        int pre[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
           pre[i+1]=pre[i]+nums[i];
        }
        int total=pre[nums.length];
        for(int i=0;i<nums.length;i++){
            int left=pre[i];
            int right=total-pre[i+1];
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}