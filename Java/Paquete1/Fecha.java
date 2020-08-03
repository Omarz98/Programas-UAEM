package Paquete1;

import java.util.Scanner;

public class Fecha{

	private int dia , mes , anio;

	public Fecha(){
		System.out.println("Construyendo fecha");

		dia = 1;
		mes= 12;
		anio = 1998;
	}

	public Fecha(int mes){
		System.out.println("Constructor 2");

		dia = 15;
		this.mes = mes;
		anio= 2018;
	}

	//metodos de acceso -> set/get
	//SET -> modificar

	public void setDia( int d){
		dia = d;
	}

	public void setMes(int m){
		mes= m;
	}

	public void setAnio(int anio){
		this.anio = anio;
	}
	
	//GET ->Consulta

	public int getDia(){
		return dia;
	}

	public int getMes(){
		return mes;
	}

	public int getAnio(){
		return anio;
	}

	public void setFecha(){
		Scanner x = new Scanner(System.in);

		System.out.println("Ingresa una fecha");
		System.out.println("Dia: ");
		this.dia = x.nextInt();
		System.out.println("Mes: ");
		this.mes = x.nextInt();
		System.out.println("Año: ");
		this.anio = x.nextInt();
	}

	public void getFechaString(){

	}

	public String toString(){
		String aux= "FECHA";

		aux += dia + "\\" + mes + "\\" +anio+ "\n";
		return aux;
	}

	


}
