class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            int cand=Math.min(arr[i],arr.length-i);
            count=Math.max(cand,count);
        }
        return count;
    }
}