class Solution {
    public int minElement(int[] nums) {
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=Math.min(minimum(nums[i]),sum);
        }
        return sum;
    }
    public static int minimum(int i){
        int sum=0;
        int dn=i;
        while(dn>0){
            int rem=dn%10;
            sum+=rem;
            dn/=10;
        }
        return sum;


    }
}