class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int ans[]= new int[1];
        int quarter=arr.length/4;
        map.forEach((key,value)->{
            if(value>quarter){
                ans[0]=key;
            }
        });
        return ans[0];
    }
}