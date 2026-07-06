class Solution {
    public String largestEven(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        if(sb.charAt(s.length()-1)=='2'){
            return sb.toString();
        }
        while(sb.length()>=1 && sb.charAt(sb.length()-1)=='1'){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}