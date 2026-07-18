class Solution {
    public int findGCD(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            max=Math.max(x,max);
            min=Math.min(x,min);
        }
        while(min>0){
            int dn=min;
            min=max%min;
            max=dn;
        }
        return max;
        
    }
}