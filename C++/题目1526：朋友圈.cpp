
// 题目1526：朋友圈

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1526
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17102025
 */

#include <stdio.h>

const int maxn = 100002;
int parent[maxn];
int n;
int m;
int i;

int findParent(int f) {
    while (parent[f] != f) {
        f = parent[f];
    }
    return f;
}

void unionTwo(int f, int t) {

    int a = findParent(f);
    int b = findParent(t);
    if (a == b) return;
    if (a > b) {
        parent[a] = b;
    } else {
        parent[b] = a;
    }
}


int main() {
    while (scanf("%d", &n) != EOF) {
        if (n == 0) {
            break;
        }
        scanf("%d", &m);
        if (n == 1) {
            printf("1\n");
        } else {
            for (i = 1; i < n + 1; i++) {
                parent[i] = i;
            }
            for (i = 0; i < m; i++) {
                int a, b;
                scanf("%d%d", &a, &b);
                unionTwo(a, b);
            }
            for (i = 1; i < n + 1; i++) {
                parent[i] = findParent(i);
            }
            int num = 0;
            for (i = 1; i < n + 1; i++) {
                if (parent[i] == i) {
                    num++;
                }
            }
            printf("%d\n", num);
        }
    }
    return 0;
}
/**************************************************************
Problem: 1526
User: wangzhenqing
Language: C++
Result: Accepted
Time:210 ms
Memory:1412 kb
****************************************************************/


                        

