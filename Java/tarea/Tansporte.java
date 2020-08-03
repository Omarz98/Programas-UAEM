package Paquete1;
import java.util.Scanner;
class Transporte{
	private String tipo;
	private float velocidad;
	private int pasajeros;

	public Transporte(){
		tipo = "pecero";
		velocidad = 40;
		pasajeros = 15;
	} 


	//set -> modoficar
	public void setTipo( String tipo){
		this.tipo = tipo;
	}

	public void setVelocidad( float velocidad){
		this.velocidad = velocidad;
	}

	public void setPasajeros( int pasajeros){
		this.pasajeros = pasajeros;
	}

	//get -> consulta

	public String getTipo(){
		return tipo;
	}

	public float getVelocidad(){
		return velocidad;
	}

	public int getPasajeros(){
		return pasajeros;
	}



	public void setTransporte(){
		Scanner x = new Scanner(System.in);
		System.out.println("Datos");
		System.out.println("Ingresa el tipo: ");
		this.tipo = x.next();
		System.out.println("Ingresa la velocidad: ");
		this.velocidad = x.nextFloat();
		System.out.println("Ingresa los pasajeros: ");
		this.pasajeros = x.nextInt();	
	}	

	public String toString(){
		System.out.println("Datos");
		String aux= "";

		aux +="Tipo: " + tipo +"\nVelocidad" + velocidad+"\nPasaje" + pasajeros;
		
		return aux;
	}

	public float calcTiempo( float dist){

		float tiempo =  4;
		//float tiempo = dist / tiempo;

		return tiempo;
	}
}