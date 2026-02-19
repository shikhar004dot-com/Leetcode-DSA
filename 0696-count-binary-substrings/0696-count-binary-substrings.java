class Solution {
    public int countBinarySubstrings(String s) {
        int arr[]= new int[s.length()];
        int a=0;
        arr[0]=1;
        for(int i=1;i<arr.length;i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                arr[++a]=1;
            }
            else{
                arr[a]++;
            }
        }
        int res=0;
        for(int i=1;i<=a;i++){
            res+=Math.min(arr[i],arr[i-1]);
        }
        return res;
        
    }
}