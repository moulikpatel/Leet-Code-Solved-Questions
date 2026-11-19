class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int arr[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                arr[i]=0;
            }
            else{
                arr[i]=st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                continue;
            }
            arr[i]=arr[i]-i;
        }
        return arr;
    }
}