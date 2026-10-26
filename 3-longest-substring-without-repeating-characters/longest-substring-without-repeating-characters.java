class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length();
        int max=Integer.MIN_VALUE;
        int i=0,j=0;
        int count=0;
        if(s.length()==0){
            return 0;
        }
        while(j<n){
            char temp=s.charAt(j);
            if(mp.containsKey(temp)){
                mp.put(temp,mp.get(temp)+1);
                count++;
            }
            else{
                mp.put(temp,1);
                count++;
            }
            while(count>mp.size()){
                char temp2=s.charAt(i);
                if(mp.get(temp2)==1){
                    mp.remove(temp2);
                }
                else{
                    mp.put(temp2,mp.get(temp2)-1);
                }
                i++;
                count--;
            }
            if(mp.size()==count){
                max=Math.max(max,(j-i+1));
            }
            j++;
        }
        return max;
        
    }
}