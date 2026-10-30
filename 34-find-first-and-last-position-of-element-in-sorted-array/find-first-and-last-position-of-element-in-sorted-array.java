class Solution {
    int firstPos(int n,int arr[],int t){
        int start=0,end=n-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==t){
                res=mid;
                end=mid-1;
            }
            else if(arr[mid]>t){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
      int lastPos(int n,int arr[],int t){
        int start=0,end=n-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==t){
                res=mid;
                start=mid+1;
            }
            else if(arr[mid]>t){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=firstPos(n,nums,target);
        int last=lastPos(n,nums,target);
        int result[]=new int[2];
        result[0]=first;
        result[1]=last;
        return result;
    }
}