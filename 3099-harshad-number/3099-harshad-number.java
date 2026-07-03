class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int dn=x;
        while(dn>0){
            int rem=dn%10;
            sum+=rem;
            dn/=10;
        }
        return (x%sum==0)?sum:-1;
    }
}