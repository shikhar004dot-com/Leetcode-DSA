class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int price=0;
        int j=0;
        for(int i=cost.length-1;i>=0;i--){
            j++;
            if(j%3==0){
                continue;  
            }
            price+=cost[i];
        }
        return price;
    }
}