class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> ll=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ll.add(arr[i]);
            if(arr[i]==0){
                ll.add(0);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ll.get(i);
        }
    }
}