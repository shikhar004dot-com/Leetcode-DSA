class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int ans=0;
        for(int x:houses){
            int high=heaters.length-1;
            int low=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(heaters[mid]==x){
                    // low=mid;
                    break;
                }
                else if(heaters[mid]<x){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            int left=Integer.MAX_VALUE;
            int right=Integer.MAX_VALUE;
            if(high>=0){
                left=x-heaters[high];
            }
            if(low<heaters.length){
                right=heaters[low]-x;
            }
            int near=Math.min(left,right);
            ans=Math.max(near,ans);
        }
        return ans;
      
        
    }
}