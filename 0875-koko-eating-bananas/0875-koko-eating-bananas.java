class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int sum=0;
        for(int x:piles){
            max=Math.max(max,x);
            sum+=x;
        }
        int high=max;
        int low=(int)Math.ceil(sum/h);
        while(low<=high){
            int mid=low+(high-low)/2;
            double time=0;
            for(int x:piles){
                time+= Math.ceil((double)x/mid);
            }
            if(time<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }    
        return low;
    }

}