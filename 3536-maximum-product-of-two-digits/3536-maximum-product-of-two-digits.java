class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> ll = new ArrayList<>();
        int count=0;
        while(n>0){
            int rem=n%10;
            ll.add(rem);
            n=n/10;
        }
        Collections.sort(ll);
        int max=0;
        for(int i=0;i<ll.size()-1;i++){
            int prod=ll.get(i)*ll.get(i+1);
            max=Math.max(prod,max);
        }
        return max; 
    }
}