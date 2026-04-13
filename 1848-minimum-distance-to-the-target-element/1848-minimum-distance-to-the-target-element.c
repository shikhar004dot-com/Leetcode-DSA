int getMinDistance(int* arr, int numsSize, int target, int start) {
    int min=INT_MAX;
    for(int i=0;i<numsSize;i++){
        if(arr[i]==target){
            int d=abs(i-start);
            if(d<min){
                min=d;
            }
        }
    }
    return min;
}