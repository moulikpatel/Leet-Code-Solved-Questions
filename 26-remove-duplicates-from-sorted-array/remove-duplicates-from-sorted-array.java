class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int count=1;
        int i=0;
        int j=i+1;
        while(j<n){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
                count++;
            }
            j++;
        }
        return count;
        
    }
}