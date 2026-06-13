class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(max,x);

        }
        int freq[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0 && freq[i]%k==0){
                sum+=freq[i]*i;   
            }
        }
        return sum;
    }
}