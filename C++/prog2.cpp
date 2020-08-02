#include <iostream>
#include <cstdlib>
#include <cmath>
using namespace std;
int main(){
	
	int arr[10];
	
	for(int i=0; i<=10; i++){
		arr[i]=10-i;
	}

	cout << "\nArreglo "<< endl;

	for(int i=0;i<10;i++)
		cout<< arr[i]<< "";

	cout << endl;
	return 0;
}
