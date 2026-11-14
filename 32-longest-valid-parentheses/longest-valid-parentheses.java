class Solution {
    public int longestValidParentheses(String s) {
            Stack<Integer> st = new Stack<>();
        st.push(-1);

        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                st.push(i);
            } 
            else {
                st.pop();

                if (st.empty()) {
                    st.push(i);
                } 
                else {
                    int count = i - st.peek();
                    maxCount = Math.max(maxCount, count);
                }
            }
        }

        return maxCount;
    }
}