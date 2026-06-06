class Solution {
    public long maximumOr(int[] nums, int k) {
        int pre[]=new int[nums.length+1];
        int suf[]=new int[nums.length+1];
        long ans=0;
        for(int i=0;i<nums.length;i++){
            pre[i+1]=nums[i] | pre[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            suf[i]=suf[i+1] | nums[i];
        }
        long mul=(long)Math.pow(2,k);
        for(int i=0;i<nums.length;i++){
            long res=pre[i] | (nums[i]*mul) | suf[i+1];
            ans=Math.max(ans,res);
        }
        return ans;



    }
}