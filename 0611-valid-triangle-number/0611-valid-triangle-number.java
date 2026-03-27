class Solution {
    public int triangleNumber(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        for(int i=n-1;i>=2;i--){
            int left=0,right=i-1;
            while(left<right){
                if (arr[left]+arr[right]>arr[i]){
                    count+=right-left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
    }
}