import java.util.*;
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] res = new boolean[s.length() +  1];
        res[0] = true;
        for (int i = 0; i < s.length(); i++) {     //后指针
            for (int j = 0; j <= i; j++) {         //前指针
                String str = s.substring(j, i + 1);
                if (res[j] && wordDict.contains(str)){
                    res[i + 1] = true;
                    break;
                }
            }
        }
        return res[s.length()];
    }
}
