class Solution {
    public int compareVersion(String version1, String version2) {
        String v1[]=version1.split("\\.");
        String v2[]=version2.split("\\.");
        int a=0;
        int b=0;
        for(int i=0;i<Math.max(v1.length,v2.length);i++){
            if(i<v1.length){
               a=Integer.parseInt(v1[i]);
            }
            else{
                a=0;
            }
            if(i<v2.length){
                b=Integer.parseInt(v2[i]);
            }
            else{
                b=0;
            }
            if(a>b){
                return 1;
            }
            else if(a<b){
                return -1;
            }
           
        }
        return 0;
    }
}