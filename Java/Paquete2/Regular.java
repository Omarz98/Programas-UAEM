package Paquete2;

import java.util.Scanner;

public class Regular extends Figura{
	
	private int numLados;
	private float apotema;
	//constructores
	public Regular(){
		//super("HOLA"); // --> super();
		System.out.println("\nConstructor triangulo");
	}

	

//
	public void setNumLados( int l){
		this.numLados= l;
	}

	public int getNumLados(){
		return numLados;
	}
	public void setApotema( float a){
		this.apotema= a;
	}

	public float getApotema(){
		return apotema;
	}
		
		
	public void calcArea(){
		float a= ( ( getNumLados() * getApotema() ) /2.0f );
		// aarea = math.pow(lado,2);
		setArea(a);
	}

	public void pedirDatos(){
		Scanner s = new Scanner(System.in);	
		System.out.println("\nTriangulo: ");
		System.out.println("Ingresa el numero de lados: ");
		//lado = s.nextFloat();
		setNumLados( s.nextInt() );
		System.out.println("Ingresa el apotema: ");
		//lado = s.nextFloat();
		setApotema( s.nextFloat() );
	}


	public String toString(){
		String s= "\nPoligono";
		s+= "numero de lados:" + getNumLados();
		s+= "Apotema"+ getApotema();
		s+= "area" + calcArea();
		return s;
	}

}
