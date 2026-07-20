class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        k%=total;
        int[] arr=new int[total];
        int idx=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[idx++]=grid[i][j];
            }
        }
        int[] rotated = new int[total];
        for (int i=0;i<total;i++) {
            rotated[(i+k) % total]=arr[i];
        }
        List<List<Integer>> res = new ArrayList<>();
        idx=0;
        for(int i=0;i<m;i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++) {
                row.add(rotated[idx++]);
            }
            res.add(row);
        }
        return res;
    }
}
