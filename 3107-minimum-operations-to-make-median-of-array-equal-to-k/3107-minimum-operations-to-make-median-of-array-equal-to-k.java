class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int idx=n/2;
        int med=nums[idx];
        long count=0;
        for(int i=idx;i>=0;i--){
            if(nums[i]>k){
                count+=nums[i]-k;
            }
            else{
                break;
            }
        }
        for(int i=idx;i<n;i++){
            if(nums[i]<k){
                count+=Math.abs(nums[i]-k);
            }
            else{
                break;
            }
        }
        return count;
    }
}