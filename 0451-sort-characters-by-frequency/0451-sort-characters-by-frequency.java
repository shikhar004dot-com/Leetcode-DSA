class Solution {
    public String frequencySort(String s) {
        int freq[]= new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        ArrayList<Character> ll=new ArrayList<>();
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                ll.add((char)i);
            }
        }
        Collections.sort(ll,(a,b)-> freq[b]-freq[a]);
        StringBuilder ans=new StringBuilder();
        for(char ch:ll){
            for(int i=0;i<freq[ch];i++){
                ans.append(ch);
            }
        }
        return ans.toString(); 
    }
}