class Solution {
    public String reverseWords(String s) {
         String arr[]=s.trim().split("\\s+");
        int n=arr.length;
        int i=0,j=n-1;
        System.out.println(Arrays.toString(arr));
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String res="";
        for(int k=0;k<n-1;k++){
            res+=arr[k]+" ";
        }
        res+=arr[n-1];
        return res;
    }
}