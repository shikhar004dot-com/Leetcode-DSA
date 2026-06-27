class Solution {
    public long repairCars(int[] ranks, int cars) {
        int min=Integer.MAX_VALUE;;
        for(int x:ranks){
            min=Math.min(min,x);
        }
        long done= (long)min*cars*cars;
        long ans=0;
        long low=1;
        while(low<=done){
            long mid=low+(done-low)/2;
            if(repair(ranks,mid,cars)){
                ans=mid;
                done=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean repair(int ranks[],long time,int cars){
        long total=0;
        for(int x:ranks){
            total+=(long) Math.sqrt(time/x);
            if(total>=cars){
                return true;
            }
        }
        return false;
    }
}