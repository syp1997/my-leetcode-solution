import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s == null){
            return 0;
        }
        int max = 0;
        int count = 0;
        int flag = 0;

        HashMap<Character, Integer> map = new  HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= flag){
                count = i - map.get(s.charAt(i));
                flag = map.get(s.charAt(i))+1;
            }
            else {
                count ++;
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, count);
        }
        return max;
    }
}
