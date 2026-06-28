class Solution {
    public List<Integer> findLonely(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(x,max);
        }
        int freq[]= new int[max+1];
        for(int x:nums){
            freq[x]++;
        }
        Arrays.sort(nums);
        ArrayList<Integer> al= new ArrayList<>();
        if(nums.length==1){
            al.add(nums[0]);
            return al;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]==1){
               if(i==0 && nums.length>1){
                    if(nums[i]+1!=nums[i+1]){
                        al.add(nums[i]);
                    }
                }
                else if(i==nums.length-1){
                    if(nums[i-1]+1!=nums[i]){
                        al.add(nums[i]);
                    }
                }
                else{
                    if(nums[i]+1!=nums[i+1] && nums[i-1]+1!=nums[i]){
                        al.add(nums[i]);
                    }
                }
            }
        }
        return al;
    }
}