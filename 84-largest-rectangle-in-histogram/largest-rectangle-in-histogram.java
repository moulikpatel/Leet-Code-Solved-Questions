class Solution {
    public int largestRectangleArea(int[] arr) {
         Stack<ArrayList<Integer>> st=new Stack<>();
        int n=arr.length;
         ArrayList<Integer> leftnearsmaller=new ArrayList<>();
         ArrayList<Integer> rightnearsmaller=new ArrayList<>();
        for(int i=0;i<n;i++){
            while(!st.empty() && arr[i]<=st.peek().get(0)){
                st.pop();
            }
            if(st.empty()){
                leftnearsmaller.add(-1);
            }
            else{
                leftnearsmaller.add(st.peek().get(1));
            }
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(arr[i]);
            temp.add(i);
            st.push(temp);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && arr[i]<=st.peek().get(0)){
                st.pop();
            }
            if(st.empty()){
                rightnearsmaller.add(n);
            }
            else{
                rightnearsmaller.add(st.peek().get(1));
            }
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(arr[i]);
            temp.add(i);
            st.push(temp);
        }
        Collections.reverse(rightnearsmaller);
        int max_area=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int width=(rightnearsmaller.get(i)-leftnearsmaller.get(i))-1;
            int area=arr[i]*width;
            max_area=Math.max(max_area,area);
        }
        return max_area;
    }
}