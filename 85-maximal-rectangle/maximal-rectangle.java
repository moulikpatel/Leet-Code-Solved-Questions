class Solution {
    static int histogram(int arr[],int n){
        Stack<Integer> st=new Stack<>();
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.empty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                left[i]=-1;
            }
            else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                right[i]=n;
            }
            else{
                right[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max((right[i]-left[i]-1)*arr[i],max);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {

        int rows=matrix.length;
        int cols=matrix[0].length;
        int temp[]=new int [cols];
        for(int i=0;i<cols;i++){
            temp[i]=Character.getNumericValue(matrix[0][i]);
        }
        int max=histogram(temp,cols);
        for(int i=1;i<rows;i++){
            for(int j=0;j<cols;j++){
                int t=Character.getNumericValue(matrix[i][j]);
                if(t==0){
                    temp[j]=0;
                }
                else{
                    temp[j]=temp[j]+t;
                }
                
            }
            max=Math.max(histogram(temp,cols),max);
        }
        return max;

        
    }
}