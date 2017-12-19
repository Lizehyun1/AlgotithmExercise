public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        int minLen = strs[0].length();
        int mark = 0;
        for (int i = 0; i < strs.length; i++) {
            if (minLen > strs[i].length()) {
                minLen = strs[i].length();
                mark = i;
            }
        }
        String minStr = new String(strs[mark]);
        for (int i = 0; i < strs.length; i++) {
            strs[i] = strs[i].substring(0,minLen);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            int j = 0;
            while (j < strs.length){
                if (strs[j].charAt(i) == minStr.charAt(i))
                    j++;
                else
                    break;
            }
            if (j == strs.length)
                sb.append(minStr.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] str = {"abcd", "abce", "abcde", "abecs"};
        System.out.println(longestCommonPrefix(str));
    }
}
