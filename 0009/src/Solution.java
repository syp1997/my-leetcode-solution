class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        int y = 0;
        int r = x;

        while (r != 0 ){
            int a = r % 10;
            y = 10*y + a;
            r = r / 10;
        }
        return y == x;
    }
}