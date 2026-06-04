class Solution {
    public int totalWaviness(int num1, int num2) {
        int wav=0;
        for(int i=Math.max(num1,101);i<=num2;i++){
           wav+=peakOrNot(i);
        }
        return wav;
    }
    public static int peakOrNot(int n){
        String s=String.valueOf(n);
        int count=0;
        for(int i=1;i<s.length()-1;i++){
            int right=s.charAt(i+1)-'0';
            int mid=s.charAt(i)-'0';
            int left=s.charAt(i-1)-'0';
            if(mid>right && mid>left){
                count++;
            }
            else if(mid<right && mid<left){
                count++;
            }
        }
       return count;
    }
}