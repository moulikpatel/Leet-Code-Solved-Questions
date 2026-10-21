class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0,j=0;
        int n=arr.length;
        int count=0;
        int avg=0;
        int sum=0;
        while(j<n){
            sum+=arr[j];
            if((j-i+1)==k){
                avg=sum/k;
                if(avg>=threshold){
                    count++;
                }
                sum=sum-arr[i];
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        return count;
    }
}