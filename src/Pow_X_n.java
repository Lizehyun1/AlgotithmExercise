public class Pow_X_n {
    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0){
            N = Math.abs(N);
            x = 1/x;
        }
        return help(x, N);
    }

    private static double help(double x, long N){
        double result = 1;
        if (N == 0)
            return 1;
        else if (N == 1)
            result = result * x;
        else {
            double half = help(x, N / 2);
            double leave = help(x, N % 2);
            result = half * half * leave;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(myPow(2, -1));
    }
}

