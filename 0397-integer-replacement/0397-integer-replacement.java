class Solution {
    public int integerReplacement(int n) {
        int count=0;
        long x=n;
        if(x==1){
            return 0;
        }
        while(x!=1){
            if(x%2==0){
                x=x/2;
            }
            else if(x%4==1 || x==3){
                x--;   
            }
            else{
                x++;
            }
            count++;
        }
        return count;
    }
}