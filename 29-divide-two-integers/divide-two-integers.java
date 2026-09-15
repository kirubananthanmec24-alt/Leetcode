class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long a = dividend;
        long b = divisor;

        boolean neg = false;

        if (a < 0) {
            a = -a;
            neg = !neg;
        }

        if (b < 0) {
            b = -b;
            neg = !neg;
        }

        long count = 0;

        while (a >= b) {
            long temp = b;
            long multiple = 1;

            while (a >= temp + temp) {
                temp = temp + temp;
                multiple = multiple + multiple;
            }

            a = a - temp;
            count = count + multiple;
        }

        if (neg)
            count = -count;

        return (int) count;
    }
}