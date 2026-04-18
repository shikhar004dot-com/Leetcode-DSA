class Solution {
    public int mirrorDistance(int n) {
        String s="";
        int dn=n;
        while(n>0){
            int rem=n%10;
            s+=rem;
            n=n/10;
        }
        int rev=Integer.parseInt(s);
        return Math.abs(rev-dn);
    }
}