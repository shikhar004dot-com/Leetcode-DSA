class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> ll= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ll.add(i);
            }
        }
        if(k>ll.size()){
            return -1;
        }
        else{
            return ll.get(k-1);
        }
    }
}