package Escuela;
import java.util.Scanner;

public class Alumno{
	
	private String nombre;
	private String numCuenta;
	private int numCreditos;
	private Escuela esc[];//arreglo

	public Alumno(){
		esc = new Escuela[10];//reserva
		numCuenta ="123234";
	}

	public void setEscuela(Escuela[] e){
		 
		this.esc = e;	
		
	}

	public void setEscuela2(Escuela e){
		esc[0]=e;
		esc[1] = e;
		
		for(int i=2; i<10; i++){
			esc[i]= e;
		}
		
	}
	
	public void datosAlumo(){
		Scanner lee = new Scanner(System.in);

		System.out.println("Ingresa el nombre del alumno");
		nombre = lee.nextLine();
		System.out.println("Ingresa el numero de cuenta");
		numCuenta = lee.nextLine();
		System.out.println("Ingresa el numero de creditos");
		numCreditos= lee.nextInt();
		//llamando a los datos de la clase escuela
		esc[0].datosEsc();
		esc[1].datosEsc();
		esc[2].datosEsc();

	}//datos

	public String toString(){
		
		String cad = "\nAlumno:" + nombre;
		cad+= "\nNumero de cuenta:" + numCuenta;
		cad+="\nCreditos" + numCreditos + "\n";
		return cad;

	}

	public void estudiando(){
		System.out.println("\nAlumno...");
		System.out.println( this.toString());
		for(int i=0; i<10; i++){
			System.out.println(esc[i].toString() );
		}
	
	}

}
