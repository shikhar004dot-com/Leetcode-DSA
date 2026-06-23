class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap=Integer.MIN_VALUE;
        for(int x:weights){
            minCap=Math.max(minCap,x);
        }
        int maxCap=0;
        for(int x:weights){
            maxCap+=x;
        }
        while(minCap<maxCap){
            int mid=minCap+(maxCap-minCap)/2;
            if(ship(weights,mid)<=days){
                maxCap=mid;
            }
            else{
                minCap=mid+1;
            }
        }
        return minCap;
    }
    public static int ship(int weights[],int cap){
        int d=1;
        int load=0;
        for(int x:weights){
            if(load+x<=cap){
                load+=x;
            }
            else{
                d++;
                load=x;
            }
        }
        return d;   
    }
}