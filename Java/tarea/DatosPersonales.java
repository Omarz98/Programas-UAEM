package Paquete1;
import java.util.Scanner;
class DatosPersonales{

	private String nombre, apPaterno,apMaterno,direccion;
	private int edad;

	public DatosPersonales(){
		nombre = "anonimo";
		edad = 15;
	}
	//set -> modoficar
	public void setNombre( String nombre){
		this.nombre = nombre;
	}

	public void setApPaterno(String apPaterno){
		this.apPaterno= apPaterno;
	}

	public void setApMaterno(String apMaterno){
		this.apMaterno = apMaterno;
	}

	public void setDireccion( String direccion){
		this.direccion= direccion;
	}

	public void setEdad( int edad){
		this.edad = edad;
	}
	
	//GET ->Consulta

	public String getNombre(){
		return nombre;
	}
	public String getApPaterno(){
		return apPaterno;
	}

	public String getApMaterno(){
		return apMaterno;
	}

	public String getDireccion(){
		return direccion;
	}
	public int getEdad(){
		return edad;
	}
	
	
	public void setDatos(){
		Scanner x = new Scanner(System.in);
		System.out.println("Datos");
		System.out.println("Ingresa tu nombre:");
		this.nombre = x.next();
		System.out.println("Ingresa tu Appellido paterno:");
		this.apPaterno = x.next();
		System.out.println("Ingresa tu Appellido Materno:");
		this.apMaterno = x.next();
		System.out.println("Ingresa tu direccion:");
		this.direccion = x.next();
		System.out.println("Ingresa tu edad:");
		this.edad = x.nextInt();
	}

	public String toString(){
		System.out.println("Datos");
		String aux= "";

		aux +="Nombre: " + nombre +  apPaterno +apMaterno + "\n";
		aux += "Direccion: "+direccion+"\n";
		aux += "Edad: "+ edad;
		return aux;
	}

	public void modificarDatos(int opc){
		switch(opc){
			case 10:
				System.out.println("Ingresa nuevo nombre");
				//setNombre(nombre);
			break;
			case 20:
				System.out.println("Ingresa nuevo apellido paterno");
			break;
			case 30: 
			System.out.println("Ingresa nuevo apellido materno");
			break;
			case 40:
			System.out.println("Ingresa nueva direccion");
			break;
			case 50:
			System.out.println("Ingresa nueva edad");
			break;

			default: 
			System.out.println("No es la opcion");
			break;
		}
	}

}