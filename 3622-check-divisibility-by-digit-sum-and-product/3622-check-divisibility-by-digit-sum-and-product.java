class Solution {
    public boolean checkDivisibility(int n) {
        int a=sum(n,0);
        int b=product(n,1);
        if(n%(a+b)==0){
            return true;
        }
        return false;  
    }
    public  int sum(int n,int s){
        if(n==0){
            return s;
        }
        s+=n%10;
        return sum(n/10,s);
       
    }
    public  int product(int n,int p){
        if(n==0){
            return p;
        }
        p*=n%10;
        return product(n/10,p);
    }
}