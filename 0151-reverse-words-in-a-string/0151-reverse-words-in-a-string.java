class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] str=s.split(" ");
        int i=0;
        int j=str.length-1;
        while(i<j){
            String dn=str[i];
            str[i]=str[j];
            str[j]=dn;
            i++;
            j--;
        }
        String ans="";
        for(int k=0;k<str.length;k++){
            if(!str[k].equals("")){
                ans+=str[k]+" ";
            }
        }
        return ans.trim();
    }
}