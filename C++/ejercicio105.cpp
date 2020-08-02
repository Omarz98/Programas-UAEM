#include <iostream>
#include<cstdlib>
#include <ctime>
using namespace std;

int promedio(int* arr,int tam, int indice,int prom)
{
	
	if(indice==tam) 
	{	
		cout <<"Promedio: "<<prom <<endl;
		return 0;
	}
	return promedio(arr,tam,indice+1,prom= arr[indice]++);
}

int pares(int* arr,int tam, int indice)
{
	if(indice==tam)return 0;
	if(arr[indice]%2==0) 
		cout<<arr[indice]<<" ";
	return pares(arr,tam,indice+1);
}

int impares(int* arr,int tam, int indice)
{
	if(indice==tam)return 0;
	if(arr[indice]%2!=0) 
		cout<<arr[indice]<<" ";
	return impares(arr,tam,indice+1);
}

/*int inicio(int* arr,int tam )
{
	return promedio(arr,tam,0,0);
	return pares(arr,tam,0);
	
}

/*void buscar(int num)
{
	if(num==0) return;
	if(num%2==0) 
		cout<<num<<endl;
	return buscar(num-1);
}*/

int main()
{
	int tam=0;
	srand(time(NULL));
	cout<<"tamaño: "<<endl;
	cin >> tam;
	
	int arr[tam];

	for(int i = 0; i<tam ; i++)
	{
		arr[i]= 1+rand()%(101-1);
	}
	
	promedio(arr,tam,0,0);
	cout<<"Numeros pares: "<<endl;
	pares(arr,tam,0);
	cout<<"\nNumeros impares: "<<endl;
	impares(arr,tam,0);
	//int prom = promedio();
	/*int num=0;
	cout<<"numero: "<<endl;
	cin >> num;
	buscar(num);*/
	return 0;
}