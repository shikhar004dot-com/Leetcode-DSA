class Solution {
    public int trailingZeroes(int n) {
        // long fact=1;
        // for(int i=1;i<=n;i++){
        //     fact*=i;
        // }
        int count=0;
        while(n>0){
            n=n/5;
            count+=n;
        }
        return count;
    }
}