class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=1;i<=8;i++){
            int n=i;
            for(int j=i+1;j<=9;j++){
                n=n*10+j;
                if(n>=low && n<=high){
                    al.add(n);
                }
            }
        }
        Collections.sort(al);
        return al;
    }
}