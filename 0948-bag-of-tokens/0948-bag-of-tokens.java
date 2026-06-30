class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0;
        int ans=0;
        int j=tokens.length-1;
        int max=0;
        while(i<=j){
            if(power>=tokens[i]){
                ans++;
                power-=tokens[i];
                max=Math.max(max,ans);
                i++;
            }
            else if(i<j && ans>0){
                ans--;
                power+=tokens[j];
                j--;
            }
            else{
                break;
            }
        }
        return max;
    }
}