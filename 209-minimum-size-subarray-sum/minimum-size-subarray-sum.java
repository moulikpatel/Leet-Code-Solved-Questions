class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int i=0,j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        while(j<n){
            sum=sum+arr[j];
            while(sum>=target){
                if((j-i+1)<min){
                    min=j-i+1;
                }
                sum=sum-arr[i];
                i++;
                //Srink
            }
            j++;
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}