/*
 * I = 1
 * V = 5
 * X = 10
 * L = 50
 * C = 100
 * D = 500
 * M = 1000
 */
public class RomanToInt {
    public static int romanToInt(String s){
        char[] ch = s.toCharArray();
        int[] trans = new int[ch.length];
        int len = ch.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (ch[i] == 'I')
                trans[i] = 1;
            else if (ch[i] == 'V')
                trans[i] = 5;
            else if (ch[i] == 'X')
                trans[i] = 10;
            else if (ch[i] == 'L')
                trans[i] = 50;
            else if (ch[i] == 'C')
                trans[i] = 100;
            else if (ch[i] == 'D')
                trans[i] = 500;
            else if (ch[i] == 'M')
                trans[i] = 1000;
        }
        result = result + trans[len - 1];
        for (int i = len - 2; i >= 0 ; i--) {
            if (trans[i] >= trans[i + 1])
                result = result + trans[i];
            else
                result = result - trans[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("DCXXI"));
    }
}
