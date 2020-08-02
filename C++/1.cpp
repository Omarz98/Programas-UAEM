#include <iostream>
//#inlclude <cstdlib>
#include <iomanip>
using namespace std;

float saldo(float horas){
	float cargo=2.0;
	
	if(horas<=3){
		return cargo;
	}else{
		cargo=(2.0+((0.5)*(horas-3)));
	}
	return cargo;
}

void imprimirDatos(float cargo,float horas){
	cout<<"Auto"<<setw(10)<<"Horas"<<setw(10)<<"Cargo"<<endl;
	
	cout<<"1"<<setw(10)<<horas<<setw(10)<<cargo<<endl;
	
}
int main(){
	float horas,cargo;	
	cout<<"Ingresa las horas: ";
	cin>>horas;
	cargo=saldo(horas);
	imprimirDatos(cargo,horas)
	
	return 0;
}
