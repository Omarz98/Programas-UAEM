package Escuela;
import java.util.Scanner;

public class Alumno{
	
	private String nombre;
	private String numCuenta;
	private int numCreditos;
	private Escuela esc;

	public Alumno(){
		numCuenta = "123654";
	}

	public void setEscuela( Escuela e){
		this.esc = e;	
	}
		
	public void datosAlum(){
		Scanner lee = new Scanner(System.in);

		System.out.println("Ingresa el nombre del alumno");
		nombre = lee.nextLine();
		System.out.println("Ingresa el numero de cuenta");
		numCuenta = lee.nextLine();
		System.out.println("Ingresa el numero de creditos");
		numCreditos= lee.nextInt();
		//llamando a los datos de la clase escuela
		esc.datosEsc();

	}//datos

	public String toString(){
		
		String cad = "\nAlumno:" + nombre;
		cad+= "\nNumero de cuenta:" + numCuenta;
		cad+="\nCreditos" + numCreditos + "\n";
		return cad;

	}

	public void estudiando(){
		System.out.println("\nAlumno...");
		System.out.println( this.toString() +
		this.esc.toString() );
	}

}
