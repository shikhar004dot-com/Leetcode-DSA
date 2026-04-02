class Solution {
    public int minAllOneMultiple(int k) {
        int res=1%k;
        for(int i=1;i<=k;i++){
            if(res==0){
                return i;
            }
            res=(res*10+1)%k;
        }
        return -1;
    }
}