class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
         int start=0,end=n-1;
        while(start<=end){
            if(arr[start]<=arr[end]){
                return arr[start];
            }
            int mid=start+(end-start)/2;
            if(arr[mid]>=arr[start]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return -1;
    }
   
}