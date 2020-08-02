#include <iostream>
using namespace std;

bool buscarAux(int* arr,int tam,int clave, int indice)
{
	if(indice==tam)return false;
	if(arr[indice]==clave)return true;
	return buscarAux(arr,tam,clave,indice+1);
}

bool buscar(int* arr,int tam,int clave )
{
	return buscarAux(arr,tam,clave,0);
}

int main()
{
	int arr[] = {-9,2,7,6,4,-3};
	bool existe = buscar(arr,5,4);
	cout<<existe<<endl;
	return 0;
}