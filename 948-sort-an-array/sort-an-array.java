class Solution {
    static void merge(int low,int high,int mid,int arr[]){
        int temp[]=new int[high-low+1];
        int index=0;
        int i=low,j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[index++]=arr[i++];
            }
            else{
                temp[index++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[index++]=arr[i++];
        }
        while(j<=high){
            temp[index++]=arr[j++];
        }
        for(int t=low;t<=high;t++){
            arr[t]=temp[t-low];
        }
    }
    static void mergeSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(low,high,mid,arr);
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        mergeSort(nums,low,high);
        return nums;

    }
}