class Solution {
    public int totalFruit(int[] fruits) {
        int max=Integer.MIN_VALUE;
        for(int x:fruits){
            max=Math.max(x,max);
        }
        int freq[]= new int[max+1];
        int si=0;
        int ans=0;
        int count=0;
        for(int ei=0;ei<fruits.length;ei++){
            if(freq[fruits[ei]]==0){
                count++;
            }
            freq[fruits[ei]]++;
            while(count>2){
                freq[fruits[si]]--;
                if(freq[fruits[si]]==0){
                    count--;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
        }
        return ans;  
    }
}