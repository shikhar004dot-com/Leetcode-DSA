class Solution {
    public int change(int amount, int[] coins) {
        int arr[]= new int[amount+1];
        arr[0]=1;
        for(int x:coins){
            for(int i=x;i<=amount;i++){
                arr[i]+=arr[i-x];
            }
        }
        return arr[amount];
    }
}