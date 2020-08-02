#include <iostream>
#include <cstdlib>
#include <iomanip>

using namespace std;

struct Tortas{
	string nombre;
	float precio;
	Tortas *sig;
};

struct Lista{
    Tortas *Inicio;
};

void imprimeDato(Tortas T){
    cout <<"Tortas"<<endl;
    cout<<"Nombre:"<<endl;
    cout<< T.nombre;
    cout<<"precio:"<<setw(10)<< fixed<< setprecision(2) << T.precio << endl;
  
}

void pedirDatos(Tortas *T){
    cout <<"\tTortas"<<endl;
    cout<<"Nombre:"<<endl;
    cin>>T->nombre;
    cout<<"precio:"<<endl;
    cin>>T->precio;
    T->sig = NULL;
}

void crearLista(Lista *L){
    cout<<"lista creada"<<endl;
    L->Inicio=NULL;
    
}

void agregarInicio(Lista *L){
    Tortas *Nuevo= new Tortas;
    pedirDatos( Nuevo );
    //t->sig=NULL;
    
    if(L->Inicio == NULL){//primer nodo
        L->Inicio= Nuevo;
    }else{//ya existe nodo
        Nuevo->sig=L->Inicio;
        L->Inicio=Nuevo;
    }
}

void eliminarInicio(Lista *L){
    if(L->Inicio== NULL){
        cout<<"\nLista vacia"<<endl;
        
    }else{
        Tortas *aux;
        aux=L->Inicio;
        L->Inicio=aux->sig;
        delete aux;
    }
}

/*void agregarAlFinal(Lista* L){
	if(L->Inicio == NULL){
		//Agregar prmer nodo
	}else{
		Nuevo->sig=L->Inicio;
        	L->Inicio=Nuevo;
		
	}
}*/

int main(){
	
	int opc,pos;
     bool existelista = false;
	Lista listita;		
     crearLista(&listita);
        
        while(true){
            cout<< "[1]crear lista\n"<<endl<<"[2]agregar nodo al inicio\n"<<"[3]agregar nodo al final\n"<<"[4]agregar nodo en pos especifica\n"<<"[5]imprimir lista en orden\n"<<"[6]imprimir lista en orden inverso\n"<<"[7]Eliminar primer nodo\n"<<"[8]Eliminar ultimo nodo\n"<<"[9]eliminar nodo especifico\n"<<"[10]Buscar nodo\n"<<"[11]salir\n"<<endl;
            cin>>opc;
            
            if(existelista==false && opc !=1){
                crearLista(&listita);
                existelista=true;
            }
            
            switch(opc){
            
                case 1:
                    crearLista(&listita);
                    existelista=true;
                    
                break;
                case 2:
                    agregarInicio(&listita);
                    existelista=true;
                break;
                
                case 3:
            		
                break;
                
                case 4:
            
                break;
                
                case 5:
            		imprimeDato(listita);
                break;
                
                case 6:
            
                break;
                
                case 7:
                    eliminarInicio(&listita);
                break;
                
                case 8:
            
                break;
                
                case 9:
            
                break;
                
                case 10:
            
                break;
                
                case 11:
                    exit (0);
                break;
                
                default:
                    cout<<"Opcion no valida"<<endl;
                break;
                
                
        }
        
        }
	
return 0;
}


