class Solution {
    public int maximumSwap(int num) {
        String s=Integer.toString(num);
        for(int i=0;i<s.length();i++){
            int j=max(s, i);
            if(j!=-1 && (s.charAt(i)-'0')<(s.charAt(j)-'0')){
                s=swap(s,i,j);
                break;

            }
        }
        return Integer.valueOf(s);
    }
    public static String swap(String s,int i,int j){
        char arr[]= s.toCharArray();
        char dn=arr[i];
        arr[i]=arr[j];
        arr[j]=dn;
        return new String(arr);

    }
    public static int max(String s,int i){
        int j=i+1;
        int max=Integer.MIN_VALUE;
        int idx=-1;
        while(j<=s.length()-1){
            if(s.charAt(j)-'0'>=max){
                max=s.charAt(j)-'0';
                idx=j;
            }
            j++;
        }
        return idx;

    }
}