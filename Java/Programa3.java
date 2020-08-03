import java.util.Scanner;

public class Programa3{

	public static void main(String[] args){
		
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa la tabla:");

		n = sc.nextInt();

		System.out.println("***Tabla***");

		for (int i=1; i<=10 ; i++){

			System.out.println(n+" * "+i+" = "+(n*i));

		}
	}
}