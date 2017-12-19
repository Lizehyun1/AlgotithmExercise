public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        int max = 0;
        int i = 0;
        int j = 0;
        String str = new String();
        while (i < s.length() && j < s.length()){
            if (Judge(str, s.charAt(j))) {
                str = str + s.charAt(j);
                j++;
                if (str.length() >= max)
                    max = str.length();
            }
            else if (!Judge(str, s.charAt(j))){
                str = new String();
                i++;
                j = i;
            }

        }
        return max;
    }

    public static boolean Judge(String s, char ch){
        int m = 0;
        while (m < s.length()){
            if (s.charAt(m) != ch)
                m++;
            else
                break;
        }
        if (m == s.length())
            return true;
        else
            return false;
    }



    public static void main(String[] args) {
        int max = lengthOfLongestSubstring("zdgjhkjbjkyibvgfgd");
        System.out.println(max);
    }
}
