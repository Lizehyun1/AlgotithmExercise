public class ReverseInteger {
    public static int reverse(int x) {
        try {
            if (x < 0) {
                Integer integer1 = new Integer(0 - x);
                StringBuilder stringBuilder = new StringBuilder(integer1.toString());
                stringBuilder.reverse();
                integer1 = Integer.parseInt(stringBuilder.toString());
                int y = 0 - integer1.intValue();
                return y;
            } else {
                Integer integer2 = new Integer(x);
                StringBuilder stringBuilder = new StringBuilder(integer2.toString());
                stringBuilder.reverse();
                integer2 = Integer.parseInt(stringBuilder.toString());
                int y = integer2.intValue();
                return y;
            }
        }
        catch (NumberFormatException ex){
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(reverse(789));
    }
}


