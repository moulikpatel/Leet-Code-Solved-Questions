class StockSpanner {
    Stack<ArrayList<Integer>> st;
    int index=0;
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        while(!st.empty() && price>=st.peek().get(0)){
            st.pop();
        }
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(price);
        temp.add(index);
        if(st.empty()){
            st.push(temp);
            index+=1;
            return index;
        }
        else{
        int result= index-st.peek().get(1);
        st.push(temp);
        index+=1;
        return result;
        }
         
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */