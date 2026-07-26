class Solution {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int prod=arr[0]*arr[1]*arr[arr.length-1];
        int prod1=arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
        int max=Math.max(prod,prod1);
        return max;
    }
}