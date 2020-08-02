#include <iostream>
#include <cstdlib>
#include <stack>
#include <queue>

using namespace std;

int main(){

	string frase;
	//queue <string> guardar;
	
	cout << "ingresa la frase"<<endl;
	//cin>> frase;
	getline(cin, frase);//lee frase cin lee frase lectura
	
	queue <char> cola;	

	int tam = frase.size();

	for(int i=0; i<tam; i++){
		cola.push( frase[i] );
	}

	for(int i=0 ; i<tam; i++){
		cout<<cola.front();
		cola.pop();
	}
	
	cout<<endl;
	return 0;
	
}
