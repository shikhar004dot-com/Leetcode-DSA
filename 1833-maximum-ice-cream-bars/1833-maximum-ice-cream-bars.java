class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=Integer.MIN_VALUE;
        for(int x:costs){
            max=Math.max(x,max);
        }
        int freq[]= new int[max+1];
        for(int x:costs){
            freq[x]++;
        }
        int ans=0;
        int sum=0;
        for(int i=1;i<=max;i++){
            while(freq[i]>0){
                if(sum+i>coins){
                    return ans;
                }
                sum+=i;
                ans++;
                freq[i]--;
            }
        }
        return ans;
    }
}