class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ll=new ArrayList<>();
        subsets(0,nums,new ArrayList<>(),ll);
        return ll;
    }
    public static void subsets(int idx,int nums[],List<Integer> ll2,List<List<Integer>> ll){
        ll.add(new ArrayList<>(ll2));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            ll2.add(nums[i]);
            subsets(i+1,nums,ll2,ll);
            ll2.remove(ll2.size()-1);
        }
    }
}