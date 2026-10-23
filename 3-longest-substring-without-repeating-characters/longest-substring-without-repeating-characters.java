class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length();
        int max_substring=Integer.MIN_VALUE;
        if(s.length()==0){
            return 0;
        }
        while(j<n){
            if(mp.containsKey(s.charAt(j))){
                mp.remove(s.charAt(i));
               i++;
            }
            else{
                mp.put(s.charAt(j),1);
                max_substring=Math.max((j-i+1),max_substring);
                j++;
            }
        }
      return max_substring;  
    }
}