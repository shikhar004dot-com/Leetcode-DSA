class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        int i=s.length()-1;
        int arr[]= new int[2];
        int even=0;
        int odd=0;
        int idx=0;
        while(i>=0){
            char ch=s.charAt(i);
            if(ch=='1'){
                if(idx%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            idx++;  
            i--;
        }
        arr[0]=even;
        arr[1]=odd;
        return arr;


    }
}