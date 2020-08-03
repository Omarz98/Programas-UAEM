package Escuela;
import java.util.Scanner;

public class Escuela{
	
	private String nombre;
	private String clave, tel;

	public Escuela(){
		clave = "123abc";
	}
		
	public void datosEsc(){
		Scanner lee = new Scanner(System.in);

		System.out.println("Ingresa el nombre de la escuela");
		nombre = lee.nextLine();
		System.out.println("Ingresa la clave de la escuela");
		nombre = lee.nextLine();
		System.out.println("Ingresa el telefono");
		tel= lee.nextLine();
	}//datos

	public String toString(){
		
		String cad = "\nEscuela:" + nombre;
		cad+= "\nClave:" + clave;
		cad+="\ntelefono" + tel + "\n";
		return cad;
	}

	public void trabajando(){
		System.out.println("\nEscuela activa");
	}

}
