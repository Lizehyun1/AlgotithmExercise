public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        int[] count = new int[126];
        for (char c : t.toCharArray()) {
            count[c]++;
        }
        int from = 0;
        int total = t.length();
        int min = Integer.MAX_VALUE;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (count[s.charAt(i)]-- > 0)
                total--;
            while (total == 0) {
                if (i - j + 1 < min) {
                    from = j;
                    min = i - j + 1;
                }
                if (++count[s.charAt(j++)] > 0)
                    total++;
            }
        }
        return (min == Integer.MAX_VALUE)? "" : s.substring(from, from + min);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}
