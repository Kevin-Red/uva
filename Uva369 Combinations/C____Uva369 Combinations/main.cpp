#include<iostream>
#include<algorithm>
#include<ctime>
#include<cstdio>

using namespace std;

int main() {
    freopen("date.in", "r", stdin);
    freopen("date.out", "w", stdout);
    long start, finish;
    double totaltime;
    start = clock();
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++) {
        int x1, y1, w, h, x;
        double u;
        int X, Y, X1;
        double M, N, K, r;
        cin >> w >> h >> x >> x1 >> y1 >> u;
        X = x1 - w;
        X1 = x1 - x;
        Y = y1 - h;
        M = X / Y;
        N = X / sqrt(X * X + Y * Y);
        K = N / u;
        r = (X1 - M * y1) / ((K / sqrt(1 - K * K)) - M);
        if (r <= 0)
            cout << "0.0000" << endl;
        else if (r > h)
            cout << "Impossible" << endl;
        else
            printf("%.4f\n", r);
    }
    finish = clock();
    totaltime = (double) (finish - start) / CLOCKS_PER_SEC;
    printf("\n此程序的运行时间为%.2f秒", totaltime);
    return 0;
}
