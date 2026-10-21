class Solution {
    static boolean isVowel(char c){
        if(c=='a' ||c=='e'|| c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int i=0,j=0;
        int Max_count=Integer.MIN_VALUE;
        int count=0;
        int n=s.length();
        while(j<n){
            if(isVowel(s.charAt(j))){
                count++;
            }
            if((j-i+1)==k){
                Max_count=Math.max(Max_count,count);
                if(isVowel(s.charAt(i))){
                    count--;
                }
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return Max_count;
    }
}