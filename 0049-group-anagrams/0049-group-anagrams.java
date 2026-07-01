class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String key= new String(arr);
            ArrayList<String> al=map.getOrDefault(key,new ArrayList<>());
            al.add(s);
            map.put(key,al);
        }
        return new ArrayList<>(map.values());
    }
}