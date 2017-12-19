import java.util.Stack;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int cLen = matrix[0].length;
        int rLen = matrix.length;
        int[] h = new int[cLen + 1];
        h[cLen] = 0;
        int max = 0;
        for (int i = 0; i < rLen; i++) {
            Stack<Integer> s = new Stack<Integer>();
            for (int j = 0; j < cLen + 1; j++) {
                if (j < cLen)
                    if (matrix[i][j] == '1')
                        h[j] += 1;
                    else
                        h[j] = 0;
                if (s.isEmpty() || h[s.peek()] <= h[j])
                    s.push(j);
                else {
                    while (!s.isEmpty() && h[j] < h[s.peek()]){
                        int top = s.pop();
                        int area = h[top] * (s.isEmpty()? j : j - 1 - s.peek());
                        if (max < area)
                            max = area;
                    }
                    s.push(j);
                }
            }
        }
        return max;
    }
}
