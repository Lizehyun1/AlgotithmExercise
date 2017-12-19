public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor){
        long result = 0;
        int sign;
        long dividend1 = (long)dividend;
        long divisor1 = (long)divisor;
        if ((dividend1 >= 0 && divisor1 > 0) || (dividend1 < 0 && divisor1 < 0))
            sign = 1;
        else
            sign = -1;
        dividend1 = Math.abs(dividend1);
        divisor1 = Math.abs(divisor1);

        //极限被除数与除数问题


        if (divisor1 == 0)
            return Integer.MAX_VALUE;
        while (dividend1 >= divisor1){
            dividend1 = dividend1 - divisor1;
            result++;
        }
        if((result * sign) > Integer.MAX_VALUE || (result * sign) < Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        else
            return (int)(result * sign);
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }
}
