import java.util.ArrayList;

class Solution {
    public int myAtoi(String str) {

        char[] chars = str.toCharArray();
        int n = chars.length;
        int i = 0;
        while (i < n && chars[i] == ' '){
            i++;
        }
        if(i == n){
            return 0;
        }

        boolean nagetive = false;
        if(chars[i] == '-'){
            nagetive = true;
            i++;
        }
        else if(chars[i] == '+'){
            i++;
        }
        else if(!Character.isDigit(chars[i])){
            return 0;
        }

        int sum = 0;
        while (i < n && Character.isDigit(chars[i])){
            int num = chars[i] - '0';
            // 注意这里有个坑，如果用sum*10 + num > Integer.MAX_VALUE，这样是不行的，左边已经越界了
            if(sum > (Integer.MAX_VALUE-num)/10){
                return nagetive? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            sum = sum*10 + num;
            i++;
        }
        return nagetive? -sum : sum;

    }
}