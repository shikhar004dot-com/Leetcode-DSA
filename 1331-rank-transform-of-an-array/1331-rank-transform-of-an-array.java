class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        Arrays.sort(res);
        HashMap<Integer,Integer> map= new HashMap<>();
        int rank=1;
        for(int x:res){
            if(!map.containsKey(x)){
                map.put(x,rank);
                rank++;

            }
        }
        int dn[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dn[i]=map.get(arr[i]);
        }
        return dn;
    }
}