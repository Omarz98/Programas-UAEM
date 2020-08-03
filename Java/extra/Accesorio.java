package extra;

import java.util.Scanner;

public class Accesorio{
	
	private String precio,kilate,tipo;
	private Accesorio r;
	
	
	public Accesorio(){
		
		r = getReloj();
		
	}
	
	public void setPrecio(String precio){
		this.precio = precio;
	}
	
	public String getPrecio(){
		return precio;
	}
	
	public void setKilate(String kilate){
		this.kilate = kilate;
	}
	
	public String getKilate(){
		return kilate;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void mostraAccesorio(){
		System.out.println("Muestro un reloj");
	}
	
	public void venderAccesorio(){
		System.out.println("Vendo un reloj");
	}
	
	public void pedirDatos(){
		Scanner x = new Scanner(System.in);
		
		System.out.println("Ingresa el precio: ");
		precio = x.next();
		System.out.println("Ingresa los kilates: ");
		kilate = x.next();
		System.out.println("Ingresa el tipo de metal: ");
		tipo = x.next();
	}
	
	public String toString(){
		String cad = "\nprecio: " + precio;
		cad+= "\nkilates: " + kilate;
		cad+= "\nmetal: " + tipo;
		
		return cad;
	}
}

