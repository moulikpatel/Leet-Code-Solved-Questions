class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int index=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n1=nums1.length;
        int n2=nums2.length;
        int result[]=new int[n1];
        for(int i=n2-1;i>=0;i--){
             while(!st.empty() && st.peek()<nums2[i] ){
                st.pop();
            }
            if(st.empty()){
                mp.put(nums2[i],-1);
            }
            else{
                mp.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<n1;i++){
            result[i]=mp.get(nums1[i]);
        }
        return result;
    }
}