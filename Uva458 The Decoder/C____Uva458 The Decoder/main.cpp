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
	char c;
	while ((c = getchar())!= EOF) {
		putchar(c == '\n' || c == '\r' ? c : c - 7);
	}
	finish=clock();
  	totaltime=(double)(finish-start)/CLOCKS_PER_SEC;
   	printf("\n�˳��������ʱ��Ϊ%.2f��",totaltime);
	return 0;
}
