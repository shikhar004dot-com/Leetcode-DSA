class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int first=Integer.MAX_VALUE;
        int last=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sieve(nums[i])){
                first=Math.min(first,i);
                last=Math.max(last,i);
            }
        }
        return last-first;
        
    }
    public static boolean sieve(int j){
        int x=j;
        if(x<2){
            return false;
        }
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}