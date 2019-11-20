#include<iostream>
#include<algorithm>
#include<ctime>
#include<cstdio>
using namespace std;
int main(){
	freopen("date.in","r",stdin);
	freopen("date.out","w",stdout);
	long start,finish;
   	double totaltime;
   	start=clock();
   	int a[4][4];int k[7][7]={{1,2,0,1,0,2},{1,2,0,2,0,1},{0,1,1,2,0,2},{0,1,0,2,1,2},{0,2,1,2,0,1},{0,2,0,1,1,2}};char s[7][4]={"BCG","BGC","CBG","CGB","GBC","GCB"};
	while(~scanf("%d%d%d%d%d%d%d%d%d",&a[0][0],&a[0][1],&a[0][2],&a[1][0],&a[1][1],&a[1][2],&a[2][0],&a[2][1],&a[2][2])){
			int min=a[0][1]+a[0][2]+a[1][0]+a[1][1]+a[2][0]+a[2][2],f=0;
			for(int i=1;i<6;i++)
				if(min>a[0][k[i][0]]+a[0][k[i][1]]+a[1][k[i][2]]+a[1][k[i][3]]+a[2][k[i][4]]+a[2][k[i][5]]){
					min=a[0][k[i][0]]+a[0][k[i][1]]+a[1][k[i][2]]+a[1][k[i][3]]+a[2][k[i][4]]+a[2][k[i][5]];
					f=i;
				}
			printf("%s %d\n",s[f],min);	
	}
	finish=clock();
  	totaltime=(double)(finish-start)/CLOCKS_PER_SEC;
   	printf("\n此程序的运行时间为%.2f秒",totaltime);
	return 0;
}
