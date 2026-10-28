class Solution {
    int binarySearch(int start,int end,int[] arr,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        // need to implement min index approch
        int n=nums.length; 
        int start=0,end=n-1;
        int minIndex=-1;
        int result=0;
         if(nums[start]<=nums[end]){
               result=binarySearch(start,end,nums,target);
               return result; 
            }
        while(start<=end){
            int mid=start+(end-start)/2;
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next]){
                minIndex=mid;
                break;
            }
            else if(nums[mid]<nums[end]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        start=0;
        end=n-1;
        if(target>=nums[start] && target<=nums[minIndex-1]){
            result=binarySearch(start,minIndex-1,nums,target);
        }
        else{
            result=binarySearch(minIndex,end,nums,target);
        }
        return result;
    }
}