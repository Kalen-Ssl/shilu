#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define loop(i, x, y) for(register int i = x;i <= y;i++)

//�ݵ��ϵ�һ��
typedef struct block {
    int i;
    int j;
    int month;
} block;
block q[1000000];
int qBegin = 0, qEnd = 0;
const int dx[] = {1, 0, -1, 0};
const int dy[] = {0, 1, 0, -1};
char ans[1000][1000];
int N, M, K;

int main() {
    loop(i, 0, 999)loop(j, 0, 999)ans[i][j] = '.';
    scanf("%d %d", &N, &M);
    char next_char=getchar();
    while(next_char!='\n')next_char=getchar();
    loop(i, 0, N - 1) {
        loop(j, 0, M - 1) {
            next_char = getchar();
            if (next_char == 'g') {
                block b = {i, j, 0};
                q[qEnd++] = b;//��������������
                ans[i][j] = 'g';
            }
        }
        next_char=getchar();
        while(next_char!='\n')next_char=getchar();
    }
    scanf("%d", &K);

    while (qBegin < qEnd) {
        block front = q[qBegin];//����ͷ��
        qBegin++;//����ͷ��
        int month = front.month;
        if (month < K) {
//            ѭ������4��������
            loop(i, 0, 3) {
                int nx = front.i + dx[i];
                int ny = front.j + dy[i];
//                �������ڷ�Χ�ڣ���δ������
                if (0 <= nx && nx < N && 0 <= ny && ny < M && ans[nx][ny] == '.') {
                    ans[nx][ny] = 'g';
                    block new_b = {nx, ny, month + 1};
                    q[qEnd++] = new_b;
                }
            }
        }
    }
    loop(i, 0, N - 1) {
        loop(j, 0, M - 1) {
            if (ans[i][j] == 'g') printf("%c", 'g');
            else printf("%c", '.');
        }
        printf("\n");
    }
    return 0;
}

