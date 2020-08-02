#include <iostream>
#include <cstdlib>

using namespace std;

struct Fecha{
	int dia;
	int mes;
	int anio;
};
struct Direccion{
	string calle, col, munic, edo;
	int numExt, numInt;
	
};
struct Persona{
	string nombre;
	int edad;
	Fecha fecNac;
	Direccion direc;
};

void datosPersonales(Persona *tmp){
	cout << "Ingresa los datos"<< endl;
	cout << "Nombre:";
	cin >> tmp->nombre;
	cout << "\nEdad: ";
	cin >> tmp->edad;
	cout << "\nFecha de nacimiento (d/m/a)";
	cin>> tmp->fecNac.dia;
	cin>> tmp->fecNac.mes;
	cin>> tmp->fecNac.anio;
	cout << "\nNumero Ext-int:";
	cin>> tmp->direc.numExt;
	cin>> tmp->direc.numInt;
	cout << "\nColonia:";
	cin>> tmp->direc.col;
	cout << "\nMunicipio:";
	cin>> tmp->direc.num;
	cout << "\nEstado:";
	cin>> tmp->direc.edo;
	cout << endl;


}

int main(){
	
	
	return 0;
}
