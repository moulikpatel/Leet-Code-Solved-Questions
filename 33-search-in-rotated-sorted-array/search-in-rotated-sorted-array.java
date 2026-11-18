class Solution {
    int getMin(int arr[],int n){
        int start=0,end=n-1;
        while(start<end){
            if(arr[start]<=arr[end]){
                return start;
            }
            int mid=start+(end-start)/2;
            if(arr[mid]>=arr[start]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    int binarySearch(int arr[],int start,int end, int n,int t){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]>t){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        // if(n==1){
        //     if(nums[0]==target){
        //         return 0;
        //     }
        //     else{
        //         return -1;
        //     }
        // }
        int minElement=getMin(nums,n);
        int index=-1;
        if(minElement==0){
            index=binarySearch(nums,0,n-1,n,target);
        }
        else if(target>=nums[0] && target<=nums[minElement-1]){
            index=binarySearch(nums,0,minElement-1,n,target);
        }
        else{
            index=binarySearch(nums,minElement,n-1,n,target);
        }
        return index;
        
    }
}