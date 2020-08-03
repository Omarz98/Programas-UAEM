package extra;

import java.util.Scanner;

public class Reloj{
	
	private String marca,modelo,hora;
	Engranes e = new Engranes();
	
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public void setHora(String hora){
		this.hora = hora;
	}
	
	public String getHora(){
		return hora;
	}
	
	public void DecirHora(){
		System.out.println("son las 8:14");
	}
	
	public void ponerReloj(){
		System.out.println("Me puse el reloj");
	}
	
	public void pedirDatos(){
		Scanner x = new Scanner(System.in);
		
		System.out.println("Ingresa la marca: ");
		marca = x.next();
		System.out.println("Ingresa el modelo: ");
		modelo = x.next();
		System.out.println("Ingresa la hora: ");
		hora = x.next();
		
		e.pedirDatos();
	}
	
	public String toString(){
		String cad = "\nmarca: " + marca;
		cad+= "\nModelo: " + modelo;
		cad+= "\nHora: " + hora;
		cad+= e.toString();
		
		return cad;
	}
	
	public static void main(String[] args){
		Reloj r = new Reloj();
		r.pedirDatos();
		System.out.println(r.toString());
	}
}