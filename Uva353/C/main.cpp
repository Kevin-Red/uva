#define _CRT_SECURE_NO_WARNINGS

#include<iostream>
#include<algorithm>
#include<string>
#include<ctime>
#include<cstdio>
#include<set>


using namespace std;

int main() {
    freopen("date.in", "r", stdin);
    freopen("date.out", "w", stdout);
    long start, finish;
    double totaltime;
    start = clock();

    string s;

    while (cin >> s) {
        string b, e;
        set<string> book;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = 1; j <= len - i; j++) {
                b = s.substr(i, j);
                e = b;
                reverse(e.begin(), e.end());
                if (b == e) {
                    book.insert(e);
                }

            }
        }
        cout << "The string '" << s << "' contains " << book.size() << " palindromes." << endl;
    };


    finish = clock();
    totaltime = (double) (finish - start) / CLOCKS_PER_SEC;
    printf("\n此程序的运行时间为%.2f秒", totaltime);
    return 0;
}
