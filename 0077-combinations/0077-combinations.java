class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ll = new ArrayList<>();
        combinations(1, n, k, new ArrayList<>(), ll);
        return ll;

    }
    public static void combinations(int start,int n,int k,List<Integer> ll2 , List<List<Integer>>ll){
        if(ll2.size()==k){
            ll.add(new ArrayList<>(ll2));
        }
        for(int i=start;i<=n;i++){
            ll2.add(i);
            combinations(i+1,n,k,ll2,ll);
            ll2.remove(ll2.size()-1);
        }

    }
}