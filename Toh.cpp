#include<iostream>
using namespace std;
void Toh(int n,char A,char B,char C){
	if(n==1){
		cout<<"Move from "<<A<<" to "<<C<<endl;
		return;
	}
	Toh(n-1,A,C,B);
	cout<<"Move "<<n<<" From "<<A<<" to "<<C<<endl;
	Toh(n-1,B,A,C);
}
int main(){
	char a=A,b=B,c=C;
	Toh(3,c,b,a);
	return 0;
}