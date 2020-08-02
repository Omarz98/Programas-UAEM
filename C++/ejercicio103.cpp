#include <iostream>
using namespace std;
void submultiplos(int numero,int probar);
void printSubmultiplo(int numero);

void submultiplos(int numero,int probar)
{
	if(probar==0) return;//caso base
	if(numero%probar==0)
	{
		cout <<probar<<endl;
	}
	submultiplos(numero,probar-1);
}

void printSubmultiplo(int numero)
{
	submultiplos(numero,numero-1);
}

int main()
{
	int numero;
	cout <<"Ingresa el numero: "<< endl;
	cin >>numero;
	
	printSubmultiplo(numero);
	return 0;
}