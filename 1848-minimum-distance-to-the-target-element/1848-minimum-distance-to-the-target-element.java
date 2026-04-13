class Solution {
    public int getMinDistance(int[] arr, int target, int start) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                min=Math.min(min,Math.abs(i-start));
            }
        }
        return min;
    }
}