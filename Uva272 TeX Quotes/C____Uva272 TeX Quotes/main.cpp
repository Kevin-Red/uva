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
   	bool isBegin = false;
   	while(~scanf("%c", &c)){
   	    if(c == '"'){
   	        if(!isBegin){
                cout << "``";
                isBegin = true;
   	        }else{
                cout << "''";
                isBegin = false;
   	        }
   	    }else{
   	        cout << c;
   	    }
   	}
	
	finish=clock();
  	totaltime=(double)(finish-start)/CLOCKS_PER_SEC;
   	printf("\n此程序的运行时间为%.2f秒",totaltime);
	return 0;
}
