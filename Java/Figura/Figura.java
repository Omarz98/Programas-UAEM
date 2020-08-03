package Figura;
import java.util.Scanner;
public abstract class Figura implements Interf1{
	
	private float lado,area;

	//constructores
	public Figura(){
		System.out.println("\nConstructor Figura");
	}

	public Figura( String cad){
		System.out.println("\nConstructor Figura" + cad);
	}

	//

	public void setLado( float lado){
		this.lado = lado;
	}	

	public float getLado(){
		return lado;
	}

	public void setArea( float a ){
		area = a;
	}

	public float getArea(){
		return area;
	}

	public void playSonido(){
		System.out.println("\nSonido...");

	}

	public String toString(){
		String v = "\nLado: "+ lado + "\n";
		return v;
	}
	
	/*public void calcPerimetro(){
		System.out.println("\nEn construccion");
	}*/

	
	public abstract void calcArea();
	public abstract void pedirDatos();

}
