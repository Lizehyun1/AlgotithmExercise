public class HammingDistance {
    public static int hammingDistance(int x, int y){
        char[] ch1 = Integer.toBinaryString(x).toCharArray();
        char[] ch2 = Integer.toBinaryString(y).toCharArray();
        char[] ch3 = new char[31];
        char[] ch4 = new char[31];

        for (int i = 0; i < ch3.length; i++) {
            ch3[i] = ch4[i] = 0;
        }


        for (int i = 0; i < ch1.length; i++) {
            int len = 30;
            ch3[len] = ch3[i];
            len--;
        }
        for (int i = 0; i < ch2.length; i++) {
            int len = 30;
            ch4[len] = ch3[i];
            len--;
        }

        int distance = 0;
        for (int i = 0; i < ch1.length; i++) {
            if (ch3[i] != ch4[i])
                distance++;
        }
        return distance;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}
