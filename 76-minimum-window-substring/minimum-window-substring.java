class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        HashMap<Character,Integer> mp=new HashMap<>();
        int count=t.length();
        int s1=s.length();
        int s2=t.length();
        for(int i=0;i<s2;i++){
            if(mp.containsKey(t.charAt(i))){
                mp.put(t.charAt(i),mp.get(t.charAt(i))+1);
            }
            else{
                mp.put(t.charAt(i),1);
            }
        }
        int i=0,j=0;
        int start=-1,end=-1;
        int min=Integer.MAX_VALUE;
        while(j<s1){
            char temp=s.charAt(j);
            if(mp.containsKey(temp)){
                mp.put(temp,mp.get(temp)-1);
                if(mp.get(temp)>=0){
                    count=count-1;
                }
            }
            while(count==0){
                if((j-i+1)<min){
                    min=j-i+1; 
                    start=i;
                    end=j;
                }
                char temp2=s.charAt(i);
                if(mp.containsKey(temp2)){
                    mp.put(temp2,mp.get(temp2)+1);
                    if(mp.get(temp2)>0){
                        count=count+1;
                    }
                    
                    
                }
                i++;
            }
            j++;
        }
        if(start==-1 || end==-1){
            return "";
        }
        return s.substring(start,end+1);
    }
}