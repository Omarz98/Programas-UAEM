package extra;

import java.util.Scanner;

public class Engranes{
	
	private String tamanio , tipo, carac;
	
	public void setTamanio(String tamanio){
		this.tamanio = tamanio;
	}
	
	public String getTamanio(){
		return tamanio;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setCarac(String carac){
		this.carac = carac;
	}
	
	public String getCarac(){
		return carac;
	}
	
	public void probar(){
		System.out.println("son las 8:14");
	}
	
	public void comprar(){
		System.out.println("Me puse el reloj");
	}
	
	public void pedirDatos(){
		Scanner x = new Scanner(System.in);
		
		System.out.println("Ingresa el tamaño: ");
		tamanio = x.next();
		System.out.println("Ingresa el tipo: ");
		tipo = x.next();
		System.out.println("Ingresa las caracteristicas: ");
		carac = x.next();
	}
	
	public String toString(){
		String cad = "\ntamaño: " + tamanio;
		cad+= "\ntipo: " + tipo;
		cad+= "\ncaracteristicas: " + carac;
		
		return cad;
	}
	
}