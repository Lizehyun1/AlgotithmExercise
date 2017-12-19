public class MyAtoi {
    public static int myAtoi(String str){
        int result;
        String s = new String();
        if(str.length() == 0 || str == null)
            return 0;
        str = str.trim();
        char firstChar = str.charAt(0);
        int sign = 1,start = 0;
        if (firstChar == '+'){
            sign = 1;
            start++;
        }
        else if (firstChar == '-'){
            sign = -1;
            start++;
        }
        for (int i = start; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                s += str.charAt(i);
                Integer integer = new Integer(Integer.parseInt(s)) * sign;
                if (integer > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                else if(integer < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }
            else
                break;
        }
        if (s.length() == 0)
            return 0;
        else {
            Integer integer = new Integer(Integer.parseInt(s)) * sign;
            result = integer.intValue();
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("a12345"));
    }

}
