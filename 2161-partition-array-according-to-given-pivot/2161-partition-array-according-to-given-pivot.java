class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       ArrayList<Integer> big=new ArrayList<>();
       ArrayList<Integer> small=new ArrayList<>();
       ArrayList<Integer> equal=new ArrayList<>();
       for(int x:nums){
            if(x>pivot){
                big.add(x);
            }
            else if(x<pivot){
                small.add(x);
            }
            else{
                equal.add(x);
            }
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<small.size();i++){
            arr[i]=small.get(i);
        }
        int j=0;
        for(int i=small.size();i<equal.size()+small.size();i++){
            arr[i]=equal.get(j);
            j++;
        }
        j=0;
        for(int i=small.size()+equal.size();i<nums.length;i++){
            arr[i]=big.get(j);
            j++;
        }
        return arr;
    }
}