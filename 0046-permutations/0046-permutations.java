class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();
        boolean done[] = new boolean[nums.length]; 
        permute(ll,nums,new ArrayList(),done); 
        return ll;     
    }
    public static void permute(List<List<Integer>>ll,int nums[],List<Integer>ll2,boolean done[]){
        if(ll2.size()==nums.length){
            ll.add(new ArrayList(ll2));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(done[i]){
                continue;
            }
            ll2.add(nums[i]);
            done[i]=true;
            permute(ll,nums,ll2,done);
            ll2.remove(ll2.size()-1);
            done[i]=false;
        }
    }
}