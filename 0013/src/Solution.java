import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = map.get(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            char prev = s.charAt(i-1);
            char cur = s.charAt(i);
            res = res + map.get(cur);
            if (map.get(cur) > map.get(prev)){
                res = res - 2*map.get(prev);
            }
        }
        return res;
    }
}