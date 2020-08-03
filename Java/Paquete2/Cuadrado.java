package Paquete2;

import java.util.Scanner;

public class Cuadrado extends Figura{

	//constructores
	public Cuadrado(){
		//super("HOLA"); // --> super();
		//System.out.println("\nConstructor cuadrado");


		pedirDatos();

		calcArea();

		System.out.println("area: "+ getArea() );

	}

	

//

		
	public void calcArea(){
		setArea(getLado() * getLado() );
		// aarea = math.pow(lado,2);
		
	}

	public void pedirDatos(){
		Scanner s = new Scanner(System.in);	
		System.out.println("\nCuadrado: ");
		System.out.println("\nIngresa la medida de  lado: ");
		//lado = s.nextFloat();
		setLado( s.nextFloat() );
	}


	public String toString(){
		String s= "\nCuadrado";

		s+= "\nCuadrado" ;
		s+= "\nlado: "+ getLado();
		s+= "\nArea" + getLado();
		return s;
	}
}
