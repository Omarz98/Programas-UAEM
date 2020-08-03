package Paquete2;

public class Principal{
	public static void main(String[] args){
		//no se puede instanciar de clase abstracta
		//Figura f = new Figura();

		Cuadrado c = new Cuadrado();

		Triangulo t = new Triangulo();
		
		Regular p = new Regular();

		//Cuadrado c = new Cuadrado();

		//OBJETO QUE USE POLIMORFISMO
		Figura f = new Cuadrado();

		Interf1 inter = new Triangulo();

		Regular r = new Figura();
		
		
	
		}
}
