#include <stdio.h>
#include <conio.h>	
struct DatosCliente{
	int cuenta;
	char apellido[15];
	char nombre[10];
	float saldo;
};

int main(){
	int i;
	struct DatosCliente clienteNulo = {0,"","",0.0};
	FILE *cuentaPtr;

	if ((cuentaPtr = fopen("cliente.dat","w")) == NULL)
		printf("No se puede abrir el archivo\n");
	else

/* Escritura de 100 registros en “blanco”*/
	for (i=1; i<= 100; i++) 
		fwrite( &clienteNulo, sizeof(struct DatosCliente),1, cuentaPtr);
		fclose(cuentaPtr);
	}

/* la variable cliente de tipo DatosCliente servirá para
asignar los almacenar los valores para cada cliente introducido */
	struct DatosCliente cliente;
	FILE *cuentaPtr;
	if ((cuentaPtr = fopen("cliente.dat","r+")) == NULL)
		printf("No se puede abrir el archivo\n");
	else{
		printf("Introduzca numero de cuenta"" (1 a 100), 0 para finalizar)\n?");
		scanf("%d", &cliente.cuenta);
		while (cliente.cuenta != 0){
			printf("Introduzca el apellido, nombre y saldo\n? ");
			scanf("%s%s%f", cliente.apellido, cliente.nombre, &cliente.saldo);
			fseek(cuentaPtr, (cliente.cuenta - 1) *
			sizeof(struct DatosCliente), SEEK_SET);
			fwrite(&cliente, sizeof(struct DatosCliente), 1, cuentaPtr);
			printf("Intruduzca n{umero de cuenta\n? ");
			scanf("%d", &cliente.cuenta);
		}
	}
	fclose(cuentaPtr);


	struct DatosCliente cliente;
	FILE *cuentaPtr;
	clrscr();
	if ((cuentaPtr = fopen("cliente.dat","r")) == NULL)
		printf("No se puede abrir el archivo\n");
	else{
		printf("%-8s%-16s%-11s%10s\n", "Cuenta", "Apellido", "Nombre","Saldo");
		while (!feof(cuentaPtr)){
			fread(&cliente, sizeof(struct DatosCliente), 1, cuentaPtr);
			if (cliente.cuenta != 0)
				printf("%-8d%-16s%-1s%10.2f\n", cliente.cuenta,cliente.apellido, cliente.nombre, cliente.saldo);
			}
		}
	fclose(cuentaPtr);
	return 0;

}





