class Solution {
    public boolean wordPattern(String pattern, String s) {

        String arr[] = s.split(" ");

        if(pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> mp1 = new HashMap<>();
        HashMap<String, Character> mp2 = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = arr[i];

            if(mp1.containsKey(ch)) {
                if(!mp1.get(ch).equals(word)) {
                    return false;
                }
            }

            if(mp2.containsKey(word)) {
                if(mp2.get(word) != ch) {
                    return false;
                }
            }

            mp1.put(ch, word);
            mp2.put(word, ch);
        }

        return true;
    }
}