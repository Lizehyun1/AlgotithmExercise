public class LongestPalindrome {
    private int max;
    private int len;
    public String longestPalindrome(String s) {
        if (s.length() < 2){
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            extendPalindrome(s, i, i +1);
            extendPalindrome(s, i, i);
        }
        return s.substring(len, len + max);
    }

    public  void extendPalindrome(String s, int j, int k){
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        if (max < k - j - 1){
            len = j + 1;
            max = k - j - 1;
        }
    }

    public static void main(String[] args) {

    }
}
