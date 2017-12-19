public class LengthofLastWord {
    public int lengthOfLastWord(String s){
        if (s.length() == 0 || s == " "){
            return 0;
        }
        String[] strs = s.split(" ");
        if (strs.length == 0)
            return 0;
        else
            return strs[strs.length - 1].length();
    }
}
