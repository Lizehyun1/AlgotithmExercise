public class IntToRoman {
    public static String intToRoman(int num){
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String s = new String();
        int x = num / 1000;
        s += M[x];
        num = num % 1000;
        x = num / 100;
        s += C[x];
        num = num % 100;
        x = num / 10;
        s += X[x];
        num = num % 10;
        s+= I[num];
        return s;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(367));
    }
}
