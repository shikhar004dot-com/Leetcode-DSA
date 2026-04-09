class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        return sliding(arr,k);
        
    }
    public static int [] sliding(int arr[], int k){
        int ans[]= new int[arr.length-k+1];  // number of window formed ==> n-k+1
        Deque<Integer> dq= new ArrayDeque<>();
        int j=0;
        // 1st window
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[dq.getLast()]<arr[i]){
                dq.removeLast();
            }
            dq.add(i);
        }
        ans[j++]=arr[dq.getFirst()];

        for(int i=k;i<arr.length;i++){
            //1 .grow
             while(!dq.isEmpty() && arr[dq.getLast()]<arr[i]){
                dq.removeLast();
            }
            dq.add(i);

            //2. shrink
            if(dq.getFirst()==i-k){ 
                dq.removeFirst();  
            }

            //3. answer
            ans[j++]=arr[dq.getFirst()];
        }
        return ans;
    }
}