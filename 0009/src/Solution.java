class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        int y = 0;

        while (x >0 ){
            int a = x % 10;
            y = 10*y + a;
            x = x / 10;
        }
        return y == x;
    }
}