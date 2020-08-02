#include <iostream>
using namespace std;



void buscar(int num)
{
	if(num==0) return;
	if(num%2==0) 
		cout<<num<<endl;
	return buscar(num-1);
}

int main()
{
	int num=0;
	cout<<"numero: "<<endl;
	cin >> num;
	buscar(num);
	return 0;
}