class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        char hex[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String s="";
        long n=num;
        if(n<0){
            n+=4294967296L;
        }
        while(n>0){
            int rem=(int)(n%16);
            s=hex[rem]+s;
            n/=16;
        }
        return s;
    }
}