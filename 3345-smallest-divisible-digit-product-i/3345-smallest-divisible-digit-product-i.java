class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n*10;i++){
            int prod=1;
            int dn=i;
            while(dn>0){
                int rem=dn%10;
                prod*=rem;
                if(prod==0){
                    break;
                }
                dn=dn/10;
            }
            if(prod%t==0){
                return i;
            }

        }
        return -1;
    
    }
}