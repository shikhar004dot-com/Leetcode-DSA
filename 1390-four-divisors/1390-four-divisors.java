class Solution {
    public int sumFourDivisors(int[] arr) {
        int res=0;
        for(int i=0;i<arr.length;i++){
            res+=divisor(arr[i]);
        }
        return res;
    }
    public static int divisor(int x){
            int sum=0;
            int count=0;
            for(int i=1;i*i<=x;i++){
                if(x%i==0){
                    count++;
                    sum+=i;
                    if(i!=x/i){
                        count++;
                        sum+=x/i;
                    }
                }
            }
            if(count==4){
                return sum;
            }
        return 0;
    }
}