#include <iostream>
#include <cstdlib>
#include <cmath>

using namespace std;
float x,y,h,k,r;

void puntoCentro(){
  cout<<"Ecuacion con el punto (x,y) , centro(h,k) y radio r"<<endl;
  cout<<"Ingresa x"<<endl;
  cin>>x;
  cout<<"Ingresa y"<<endl;
  cin>>y;
  cout<<"Ingresa h"<<endl;
  cin>>h;
  cout<<"Ingresa k"<<endl;
  cin>>k;
  cout<<"Ingresa r"<<endl;
  cin>>r;
  if(h==0 && k==0){
    cout<<"Ecuacion: "<<x<<"^2+"<<y<<"^2="<<pow(r,2)<<endl;
  }else{
    cout<<"Ecuacion: ("<<x<<-1*h<<")^2"<<"+"<<"("<<y<<-1*k<<")^2"<<"="<<pow(r,2)<<endl;
  }
}

void extremosDiametro(){
	float a1,a2,b1,b2;
	cout<<"Ecuacion por medio de los puntos del diametro "<<endl;
	cout<<"Ingresa punto A"<<endl;
	cin>>a1;
	cin>>a2;
	cout<<"Ingresa el punto B"<<endl;
	cin>>b1;
	cin>>b2;
	
	float c1=(a1+b1)/a1;
	float c2=(a2+b2)/a1;
	
	cout<<"C =("<<c1<<","<<c2<<")"<<endl;
	float r1=pow((a1-c1),2)+pow((a2-c2),2);
	r=sqrt(r1);
	
	cout<<"Radio: "<<r<<endl;
	
	cout<<"Ecuacion: ("<<"x "<<-1*c1<<")^2"<<"+"<<"("<<"y"<<-1*c2<<")^2"<<"="<<pow(r,2)<<endl;
}

void centroDiametro(){
	float a1,a2;
    cout<<"Ecuacion con centro y que pasa por un punto"<<endl;
	cout<<"Ingresa C(h,k)"<<endl;
    cin>>h;
    cin>>k;
    cout<<"Ingresa el punto: "<<endl;
  	cin>>a1;
   	cin>>a2;
    r=(pow((h-a1),2))+( pow((k-a2),2));
    		
    cout<<"Radio= "<<r<<endl;
    cout<<"Ecuacion: ("<<"x "<<-1*h<<")^2"<<"+"<<"("<<"y+"<<-1*k<<")^2"<<"="<<r<<endl;
}

void centroTangente(){
	cout<<"Ecuacion centro y tangente"<<endl;
    cout<<"Ingresa el centro(k,k)"<<endl;
    cin>>h;
    cin>>k;
    r=h;
	cout<<"Radio= "<<r<<endl;
    cout<<"Ecuacion: ("<<"x "<<-1*h<<")^2"<<"+"<<"("<<"y+"<<-1*k<<")^2"<<"="<<pow(r,2)<<endl;
}

void rectaCentro(){
	float a,b,c;
	cout<<"Ecuacion recta tangente y centro(h,k)"<<endl;
	cout<<"Ingresa el valor A B C de la ecuacion"<<endl;
	cin>>a;
	cin>>b;
	cin>>c;
	cout<<"Ingresa el centro(h,k)"<<endl;
	cin>>h;
	cin>>k;
	float raiz=(pow(a,2)+pow(b,2));
	r=((a*h)+(b*k)+c)/(sqrt(raiz) );
			
	cout<<"Radio: "<<r<<endl;
	
	cout<<"Ecuacion: ("<<"x "<<-1*h<<")^2"<<"+"<<"("<<"y"<<-1*k<<")^2"<<"="<<pow(r,2)<<endl;
}
void rMayor(){
	float a1,a2;
	cout<<"Puntos a la circunferencia"<<endl;
	cout<<"Ingresa el centro (h,k)"<<endl;
	cin>>h;
	cin>>k;
	cout<<"Ingresa r: "<<endl;
	cin>>r;
	cout<<"Ingresa el punto"<<endl;
	cin>>a1;
	cin>>a2;
	float raiz= pow((h-a1),2)+pow((k-a2),2);
	raiz= sqrt(raiz);
	r=sqrt(r);
	if(r<raiz){
		cout<<"El punto es menor que el radio"<<endl;
	}else{
		cout<<"El punto es mayor que el radio"<<endl;
	}
}

int main(){
  
  int opc;
  for(;;){
    //system("cls");
    cout<<"**********Ecuacion de la circunferencia**********"<<endl<<endl;
    cout<<"[1]Ecuacion con el punto (x,y) , centro(h,k) y radio r"<<endl;
	cout<<"[2]Ecuacion por medio de los puntos del diametro"<<endl;
	cout<<"[3]Ecuacion con centro y que pasa por un punto"<<endl;
	cout<<"[4]Ecuacion centro y tangente"<<endl;
	cout<<"[5]Ecuacion recta tangente y centro(h,k)"<<endl;
	cout<<"[6]Puntos a la circunferencia"<<endl;
    cin>>opc;
    
    switch(opc){
    	case 1:
    		puntoCentro();
    	break;
    	case 2:
    		extremosDiametro();
    	break;
    	case 3:
    		centroDiametro();
    	break;
    	case 4:
    		centroTangente();	
    	break;
		case 5:
			rectaCentro();
		break;
		case 6:
			rMayor();
		break;	
		case 7:
			float a,b,c,d,e,f;
			cout<<"Ecuacion con punto de interseccion de 2 rectas es el centro"<<endl;
			cout<<"Ingresa el radio"<<endl;
			cin>>r;
			cout<<"Ingresa la primera ecuacion (x y c)"<<endl;
			cin>>a;
			cin>>b;
			cin>>c;
			cout<<"Ingresa la segunda ecuacion"<<endl;
			cin>>d;
			cin>>e;
			cin>>f;
			
			
			//float resul= ;
		break;
    	//default:
    	//break;
	}
	cout<<endl;
  }


  return 0;
}
