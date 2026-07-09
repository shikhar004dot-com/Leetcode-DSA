class Solution {
    public String fractionAddition(String expression) {
        String str[]= expression.split("/|(?=[+-])"); //[-1,2,+1,2]
        int arr[]= new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        int n=0;
        int l=lcm(arr);
        for(int i=0;i<arr.length;i+=2){
            n+=arr[i]*(l/arr[i+1]);
        } 
        int g=gcd(Math.abs(n),l);
        n/=g;
        l/=g;
        String ans=n+"/"+l;
        return ans;
    }
    public static int lcm(int arr[]){
        int l=arr[1];
        for(int i=3;i<arr.length;i+=2){
            l=(l*arr[i])/gcd(l,arr[i]);
        }
        return l;

    }
    public static int gcd(int a,int b){
        while(b>0){
            int dn=b;
            b=a%b;
            a=dn;
        }
        return Math.abs(a);
    }
}