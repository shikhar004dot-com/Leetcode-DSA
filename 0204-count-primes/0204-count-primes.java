class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        return sieve(n,0);
    }
     public static int sieve(int n,int count){
        int prime[]=new int[n];
        prime[0]=prime[1]=1;   // 0 and 1 are not prime number
        for(int i=2;i*i<prime.length;i++){
            if(prime[i]==0){  // it is prime
                for(int j=2;i*j<prime.length;j++){
                    prime[i*j]=1;
                }
            }
        }
        for(int i=0;i<prime.length;i++){
            if(prime[i]==0){
                count++;
            }
        }
        return count;
    }
}