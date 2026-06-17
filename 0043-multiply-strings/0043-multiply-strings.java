class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int x=num1.length();
        int y=num2.length();
        int arr[]=new int[x+y];
        for(int i=x-1;i>=0;i--){
            for(int j=y-1;j>=0;j--){
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int d=i+j;
                int c=i+j+1;
                int sum=mul+arr[c];
                arr[c]=sum%10;
                arr[d]+=sum/10;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int z:arr){
            if(!(ans.length()==0 && z==0)){
                ans.append(z);
            }
        }
        return ans.toString();
    }
}