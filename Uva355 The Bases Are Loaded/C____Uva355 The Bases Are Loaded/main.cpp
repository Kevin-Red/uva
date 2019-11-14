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

   	int b, e;
   	string s;
   	while(cin >> b >> e >> s){
   	    int len = s.length();
   	    long long sum = 0;
   	    int i;
   	    if(s == "0"){
            cout << s << " base " << b << " = " << s << " base " << e << endl;
            continue;
   	    }
   	    for(i = len - 1 ; i >= 0; i --){
   	        char c = s[i];
   	        int num;
   	        if(c >= '0' && c <= '9'){
   	            num = c - '0';
   	        }else{
   	            num = c - 'A' + 10;
   	        }
   	        if(num >= b){
   	            cout << s << " is an illegal base " << b << " number" << endl;
                break;
   	        }
            long long  key = 1;
   	        for(int j = 1; j <= len - i - 1; j++){
   	            key *= b;
   	        }
   	        sum += key * num;
   	    }
   	    if(i == -1){
   	        if(e == 10){
   	            cout << s << " base " << b << " = " << sum << " base " << e << endl;
   	        }else{
                string newS;
                while (sum != 0){
                    int num = sum % e;
                    char c;
                    if(num >= 10){
                        c = 'A' - 10 + num;
                    }else{
                        c = '0' + num;
                    }
                    newS.insert(newS.begin(), c);
                    sum /= e;
                }
                cout << s << " base " << b << " = " << newS << " base " << e << endl;
   	        }
   	    }
   	}

	finish=clock();
  	totaltime=(double)(finish-start)/CLOCKS_PER_SEC;
   	printf("\n此程序的运行时间为%.2f秒",totaltime);
	return 0;
}
