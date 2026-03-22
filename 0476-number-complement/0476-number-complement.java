class Solution {
    public int findComplement(int num) {
        String bin=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder();
        for (char c:bin.toCharArray()){
            if(c=='0'){
                sb.append('1');
            } 
            else{
                sb.append('0');
            }
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}