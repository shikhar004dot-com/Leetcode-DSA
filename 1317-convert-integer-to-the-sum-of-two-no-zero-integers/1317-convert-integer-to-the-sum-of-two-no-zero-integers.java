class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int diff=n-i;
            if(!String.valueOf(i).contains("0") && !String.valueOf(diff).contains("0")){
                return new int[] {i,diff};
            }
        }
        return new int[0];
    }
}