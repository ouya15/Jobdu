
// 题目1522：包含min函数的栈

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年01月23日19:35:13
 * @url：http://ac.jobdu.com/problem.php?pid=1522
 * 每次把最小数保存在minStack中，pop的时候判断是否和当前栈顶元素相等。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/43090751
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Stack;

public class Prob1522 {
    /*
     * 1522
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            Stack<Integer> stack = new Stack<Integer>();
            Stack<Integer> minStack = new Stack<Integer>();
            for (int i = 0; i < n; i++) {
                st.nextToken();
                String s = st.sval;
                if (s.equals("s")) {
                    st.nextToken();
                    int num = (int) st.nval;
                    stack.push(num);
                    if (minStack.isEmpty() || num < minStack.peek()) {
                        minStack.push(num);
                    }
                } else if (s.equals("o")) {
                    int num = stack.pop();
                    if (num == minStack.peek()) {
                        minStack.pop();
                    }
                }
                if (minStack.isEmpty()) {
                    System.out.println("NULL");
                } else {
                    System.out.println(minStack.peek());
                }
            }
        }
    }
}

/**************************************************************
 Problem: 1522
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:860 ms
 Memory:26968 kb
 ****************************************************************/
