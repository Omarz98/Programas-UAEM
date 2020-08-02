#include <iostream>
using namespace std;

void imprime(int n)
{
	if(n<=0)return;//caso base
	
	cout << n << endl;
	imprime(n-1);//invocacion recursiva 
	
}

int main()
{
	imprime(10);
	return 0;
}