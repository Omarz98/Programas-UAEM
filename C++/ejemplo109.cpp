#include <iostream>
using namespace std;

long factorial(int n)
{
	if(n==0) return 1;//caso base
	
	return n*factorial(n-1);
}

int main()
{
	long res = factorial(6);
	cout<< "Resultado: "<<res<<endl;
	return 0;
}