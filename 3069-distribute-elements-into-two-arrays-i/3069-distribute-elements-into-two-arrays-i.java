class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> al= new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        al.add(nums[0]);
        al2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(al.get(al.size()-1)>al2.get(al2.size()-1)){
                al.add(nums[i]);
            }
            else if(al.get(al.size()-1)<al2.get(al2.size()-1)){
                al2.add(nums[i]);
            }
        }
        for(int i=0;i<al2.size();i++){
            al.add(al2.get(i));
        }
        int res[]= new int[nums.length];
        for(int i=0;i<al.size();i++){
            res[i]=al.get(i);
        }
        return res;
    }
}