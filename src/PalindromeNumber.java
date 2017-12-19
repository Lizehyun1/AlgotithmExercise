public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        Integer integer = new Integer(x);
        String s1 = new String(integer.toString());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s1);
        String s2 = new String(stringBuilder.reverse());
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-2147447412));
    }
}
