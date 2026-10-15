

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> charMap = new HashMap<>();
        for (int i=0; i < s.length(); i++){
            char sChar = s.charAt(i);
            int charCount = charMap.getOrDefault(sChar,0);
            charCount++;
            charMap.put(sChar, charCount);
        }

        for (int j=0; j < t.length(); j++){
            char tChar = t.charAt(j);
            int charCount = charMap.getOrDefault(tChar, 0);
            charCount--;
            charMap.put(tChar, charCount);
        }

        for (var entry: charMap.entrySet()){
            if (entry.getValue()!=0){
                return false;
            }
        }
        return true;

    }
}
