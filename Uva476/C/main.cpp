#define _CRT_SECURE_NO_WARNINGS
#include<iostream>
#include<algorithm>
#include<string>
#include<ctime>
#include<cstdio>
using namespace std;
int main(){
	freopen("date.in","r",stdin);
	freopen("date.out","w",stdout);
	long start,finish;
   	double totaltime;
   	start=clock();
	char r;int  num = 0, count = 1;
	double a[12], b[12], c[12], d[12], x, y;
	while (cin >> r && r != '*') cin >> a[++num] >> b[num] >> c[num] >> d[num];
	while (scanf("%lf%lf", &x, &y) && x != 9999.9 && y != 9999.9) {
		int flag = 1;
		for (int i = 1; i <= num; ++i){
            if (a[i] < x && c[i] > x &&d[i] < y && b[i] > y) {
                flag = 0;
                printf("Point %d is contained in figure %d\n", count, i);
            }
		}
		if (flag){
            printf("Point %d is not contained in any figure\n", count);
		}
		count++;
	}
	finish=clock();
  	totaltime=(double)(finish-start)/CLOCKS_PER_SEC;
   	printf("\n此程序的运行时间为%.2f秒",totaltime);
	return 0;
}
