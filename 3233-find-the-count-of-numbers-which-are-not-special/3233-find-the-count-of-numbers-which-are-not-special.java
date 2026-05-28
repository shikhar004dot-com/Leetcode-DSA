class Solution {
    public int nonSpecialCount(int l, int r) {
        int count=0;
        for(int i=2;i<=31623;i++){
            int a=prime(i);
            if(a*a>=l && a*a<=r){
                count++;
            }
        }
        return (r-l+1)-count;
    }
    public static int prime(int i){
        boolean flg=true;
        int x=i;
        for(int j=2;j*j<=x;j++){
            if(x%j==0){
                flg=false;
                break;
            }
        }
        if(flg){
            return x;
        }
        return 0;
    }

}