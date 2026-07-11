class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            max=Math.max(x,max);
            min=Math.min(x,min);
        }
        return ((max-k)-(min+k))<=0 ? 0:(max-k)-(min+k);
    }
}