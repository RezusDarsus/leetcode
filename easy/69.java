class Solution {
     public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int result = 0;

        for (int i = 1; i <= x / 2 + 1; i++) {
            if ((long) i  * i == x) {
                return i;  
            }
            if ((long) i * i > x) {
                return i - 1;  
            }
        }

        return result;
    }


}
