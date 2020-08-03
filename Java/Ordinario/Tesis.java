//Composicion la tesis esta compuesta por un autor

package Ordinario;

import java.util.Scanner;

public class Tesis{
	
	private String titulo;
	
	Autor a = new Autor();
	
	public Tesis(){
		
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public void pedirDatos(){
		Scanner x = new Scanner(System.in);
		System.out.println("Ingresa el titulo: ");
		titulo = x.next();
		a.pedirDatos();
	}
	
	public String toString(){
		String cad = "\nTitulo: " + titulo;
		a.toString();
		return cad;
	}
	
	public static void main(String[] args){
		Tesis t = new Tesis();
		t.pedirDatos();
		t.toString();
	}
	
	
}