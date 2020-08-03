package Figura;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Principal2{

	public static void main(String[] args){
		Principal2.metodo1();
		Principal2.metodo2();
		Principal2.metodo3();
	}
	
	public static void metodo1(){
		//sx arreglo
		//Tipodedato indent[] = new Tipodedato[tam]

		int arr1[] = new int[10];

		Random r = new Random();

		for(int i= 0; i<10;i++)
			arr1[i] = r.nextInt(10);
										//10 + [0:10] = 10+20

		for( int i = 0; i<10; i++)
			System.out.print(arr1[i]+ " ");
	}

	public static void metodo2(){
		int n=20;
		float[] a2 = new float[n];

		for(int i = 0; i<n; i++)
			a2[i] = (float) Math.random();

		System.out.println("\nmetodo 2");

		for(int i=0; i<n ; i++)
			System.out.print(a2[i] + " ");
		System.out.println();
	}

	public static void metodo3(){
		//ArrayList<Tipo de dato> ident;// declarar
		//ident = new ArrayList<Tipodato>();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(59);

		arr.add(6);

		arr.add(6);

		arr.add(6);

		arr.add(1,100);

		for (int i=0; i< arr.size(); i++){
			System.out.print(" " + arr.get(i) );
		}

		arr.add(2,600);
		for (int i=0; i<arr.size(); i++){
			System.out.print(" " + arr.get(i) );
		}
		System.out.println();

		arr.clear();
		System.out.print("tamaño " + arr.size() );

		if(arr.isEmpty() )
			System.out.println("Arreglo vacio");
		else
			System.out.println("Arreglo con elementos");

		arr.remove(1);
		System.out.println(arr);

	} 
}
