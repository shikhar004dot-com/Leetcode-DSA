class Solution {
    public int islandPerimeter(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    sum+=4;
                    if(i>0 && arr[i-1][j]==1){
                        sum-=2;
                    }
                    if(j>0 && arr[i][j-1]==1){
                        sum-=2;
                    }
                }
            }
        }
        return sum; 
    }
}