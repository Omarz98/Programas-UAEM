import java.lang.*;//paquete de especificacion lang
import java.util.Scanner;

public class Programa1{

	//atributos

	//metodos

	public static void main(String[] args){

		int a =19;
		String nom;
		System.out.print("\tHola mundo \n");
		System.out.println("mensaje 2:"+a+"sadsdf");
		System.out.printf("msj 3: %d",a);

		Scanner x = new Scanner(System.in);
		System.out.println("Ingresa 2 enteros");
		float m,n,s;
		m= x.nextFloat();
		n= x.nextFloat();

		System.out.println("M: "+m+" n:"+n);
		s = m+n;
		System.out.println("suma: "+s);

		//nom=x.next();
		x.nextLine();
		nom=x.next();

		System.out.println("Nom: "+nom);

		char c = x.nextLine().charAt(0);
		System.out.println("Car: "+c);

	}//main

}
