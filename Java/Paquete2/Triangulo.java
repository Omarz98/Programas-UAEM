package Paquete2;

import java.util.Scanner;

public class Triangulo extends Figura{
	
	private float lado2;
	//constructores
	public Triangulo(){
		//super("HOLA"); // --> super();
		System.out.println("\nConstructor triangulo");
	}

	

//
	public void setLado2( float l){
		this.lado2= l;
	}

	public void getLado(){
		return lado2;
	}
		
	public void calcArea(){
		float a= ( (getLado() * getLado2() ) / 2.0f );
		// aarea = math.pow(lado,2);
		setArea(a);
	}

	public void pedirDatos(){
		Scanner s = new Scanner(System.in);	
		System.out.println("\nTriangulo: ");
		System.out.println("Ingresa la medida de la base: ");
		//lado = s.nextFloat();
		setLado( s.nextFloat() );
		System.out.println("Ingresa la medida de la altura: ");
		//lado = s.nextFloat();
		setLado2( s.nextFloat() );
	}


	public String toString(){
		String s= "\nTriangulo";
		s+= "base:" + getLado();
		s+= "Altura"+ getLado2();
		s+= "area" + calcArea();
		return s;
	}

}
