#include<iostream>
using namespace std;
bool num(string n,int sta,int en);
int main(){
	cout <<"Hello";
	cout << num("anana",0,4) << endl;
}
bool num(string n,int sta,int en){
	if(sta>=en)
		return true;
	return (n[sta]==n[en])&&num(n,sta,en);
}