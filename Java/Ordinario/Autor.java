package Ordinario;
import java.util.Scanner;

public class Autor{
	
	private String nombre;
	public Autor(){
		
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void pedirDatos(){
		Scanner x = new Scanner(System.in);
		
		System.out.println("Ingresa el titulo: ");
		nombre = x.next();
	}
	
	public String toString(){
		String cad = "\nNombre del autor: " + nombre;
		
		return cad;
	}
}