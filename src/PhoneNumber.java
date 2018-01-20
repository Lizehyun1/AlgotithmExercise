import java.util.*;
public class PhoneNumber {
    public static List<String> letterCombinations(String digits) {
        String[] nums = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        if (digits.length() == 0 || digits == null)
            return result;
        for (int i = 0; i < nums[Integer.parseInt(new Character(digits.charAt(0)).toString())].length(); i++) {
            result.add(new Character(nums[Integer.parseInt(new Character(digits.charAt(0)).toString())].charAt(i)).toString());
        }
        if (digits.length() > 1) {
            for (int i = 1; i < digits.length(); i++) {
                String str = nums[Integer.parseInt(new Character(digits.charAt(i)).toString())];
                result = help(result, str);
            }
        }
        return result;
    }

    public static List<String> help(List<String> list, String str){
        List<String> temp = new ArrayList<>();
        for (String string: list) {
            for (int i = 0; i < str.length(); i++) {
                temp.add(string + new Character(str.charAt(i)).toString());
            }
        }
        list = temp;
        return list;
    }

    public static void main(String[] args) {
        List<String> result = letterCombinations("23");
        System.out.println(result);
    }
}
