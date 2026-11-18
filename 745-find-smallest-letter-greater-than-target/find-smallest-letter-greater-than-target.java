class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int tar=target;
        int n=letters.length;
        int start=0,end=n-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int temp=letters[mid];
            if(temp>target){
                res=temp;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return (res==-1)?letters[0] :(char)res;
    }
}