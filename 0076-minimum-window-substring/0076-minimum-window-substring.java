class Solution {
    public String minWindow(String s, String t) {
        int freq[]= new int[128];
        for(char ch:t.toCharArray()){
            freq[ch]++;
        }
        int ei=0;
        int min=Integer.MAX_VALUE;
        int si=0;
        int window[]= new int[128];
        int start=0;
        while(ei<s.length()){
            char ch=s.charAt(ei);
            window[ch]++;
            ei++;
            while(valid(freq,window)){
                int l=ei-si;
                if(l<min){
                    min=l;
                    start=si;
                }
                window[s.charAt(si)]--;
                si++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return "";
        }
        String ans="";
        for(int i=start;i<min+start;i++){
            ans+=s.charAt(i);
        }
        return ans;
    }
    public static boolean valid(int freq[],int window[]){
        for(int i=0;i<128;i++){
            if(window[i]<freq[i]){
                return false;
            }
        }
        return true;
    }
}