public class SqrtX {
    public static double mySqrt(int x) {
        double r = 1;
        while (Math.abs(r * r - x) > 0.001) {
            r = ((r * r) + x) / (2 * r);
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2));
    }
}
