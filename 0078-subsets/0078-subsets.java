class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();
        subset(ll,nums,new ArrayList<>(),0);
        return ll;   
    }
    public static void subset(List<List<Integer>>ll,int nums[],List<Integer>ll2,int idx){
        if(idx==nums.length){
            ll.add(new ArrayList<>(ll2));
            return;
        }
        // pick
        ll2.add(nums[idx]);
        subset(ll,nums,ll2,idx+1);

        //dont pick
        ll2.remove(ll2.size()-1);
        subset(ll,nums,ll2,idx+1);

    }
}