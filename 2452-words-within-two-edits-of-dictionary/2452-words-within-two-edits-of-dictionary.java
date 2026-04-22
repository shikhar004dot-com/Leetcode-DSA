class Solution {
    public List<String> twoEditWords(String[] que, String[] dict) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<que.length;i++){
            String word=que[i];
            for(int j=0;j<dict.length;j++){
               String res=dict[j];
            
            int count=0;
            for(int k=0;k<res.length();k++){
                if(word.charAt(k)!=res.charAt(k)){
                    count++;
                }
            }
            if(count<=2){
                ans.add(que[i]);
                break;
            }
        }
        }
        return ans;
    }
}