#include <iostream>
#include <cstdlib>
#include <iomanip>

using namespace std;

struct tortas{
	string nombre;
	float precio;
	tortas* sig;
};

struct lista{
    tortas* Inicio;
};

void imprimedato(tortas t){
    cout <<"Tortas"<<endl;
    cout<<"Nombre:"<<endl;
    cout>> t.nombre;
    cout<<"precio:"<<setw(10)<< fixed<< setprecision(2) << t.precio << endl;
  
}

void pedirdato(tortas *t){
    cout <<"\tTortas"<<endl;
    cout<<"Nombre:"<<endl;
    cin>>t->nombre;
    cout<<"precio:"<<endl;
    cin>>t->precio;
    t->sig=NULL;
}

void crearlista(lista* L){
    cout<<"CReando lista"<<endl;
    L->Inicio=NULL;
    
}

void agregarinicio(lista* L){
    tortas *nuevo= new tortas;
    pedirdato( nuevo );
    //t->sig=NULL;
    
    if(L->Inicio== NULL){//primer nodo
        L->Inicio= nuevo;
    }else{//ya existe nodo
        nuevo->sig=L->Inicio;
        L->Inicio=nuevo;
    }
}

void eliminarinicio(lista *L){
    if(L->Inicio== NULL){
        cout<<"\nLista vacia"<endl;
        
    }else{
        tortas *aux;
        aux=L->Inicio;
        L->Inicio=aux->sig;
        delete aux;
    }
}

int main(){
	//tortas* Inicio;
        int opc,pos;
        bool existelista = false;
        lista= listita;
        
        while(true){
            cout<< "[1]crear lista\n"<<endl<<"[2]agregar nodo al inicio\n"<<"[3]agregar nodo al final\n"<<"[4]agregar nodo en pos especifica\n"<<"[5]imprimir lista en orden\n"<<"[6]imprimir lista en orden inverso\n"<<"[7]Eliminar primer nodo\n"<<"[8]Rliminar ultimo nodo\n"<<"[9]eliminar nodo especifico\n"<<"[10]Buscar nodo\n"<<"[11]salir\n"<<endl;
            cin<<opc;
            
            if(existlista==false && opc !=1){
                crearlista();
                existelista=true;
            }
            
            switch(opc){
            
                case 1:
                    crearlista(&listita);
                    existelista=true;
                    
                break;
                case 2:
                    agregarinicio(&listita);
                    existelista=true;
                break;
                
                case 3:
            
                break;
                
                case 4:
            
                break;
                
                case 5:
            
                break;
                
                case 6:
            
                break;
                
                case 7:
                    eliminarinicio(&listita);
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
