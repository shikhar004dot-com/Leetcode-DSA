class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int arr[]= new int[derived.length];
        for(int i=0;i<derived.length-1;i++){
            if(derived[i]==1){
                arr[i+1]=arr[i]^1;
            }
            else if(derived[i]==0){
                arr[i+1]=arr[i];
            }
        }
        int res=arr[0]^arr[arr.length-1];
        if(derived[derived.length-1]==res){
            return true;
        }
        return false;
    }
}