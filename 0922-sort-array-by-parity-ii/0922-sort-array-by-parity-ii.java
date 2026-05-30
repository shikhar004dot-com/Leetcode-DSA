class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=-1;
        for(int i=0;i<nums.length-1;i++){
            if(i%2==0 && nums[i]%2==0 || i%2!=0 && nums[i]%2!=0){
                continue;
            }
            else{
                n=nums[i];   
                for(int j=i+1;j<nums.length;j++){
                    if(i%2==0 && nums[j]%2==0 || i%2!=0 && nums[j]%2!=0){
                       nums[i]=nums[j];
                       nums[j]=n;
                       break;
                    }
                }
            }
        }
        return nums;
    }
}