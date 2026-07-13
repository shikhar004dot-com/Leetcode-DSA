class Solution {
    public int countSegments(String s) {
        String t=s.trim();
        if(t.isEmpty()){
            return 0;
        }
        String str[]= t.split("\\s+");
        return str.length;
    }
}