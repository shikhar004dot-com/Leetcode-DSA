class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum=0;
        int sqSum=0;
        while(n>0){
            int rem=n%10;
            dsum+=rem;
            sqSum+=rem*rem;
            n/=10;
        }
        return (sqSum-dsum>=50)?true:false;
    }
}