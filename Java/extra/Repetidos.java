package extra;

import java.util.Scanner;
import java.util.Random;

public class Repetidos{
	
	private int[] arr,arr2;
	private int tam;
	
	public int pedirNum(){
		Scanner x = new Scanner(System.in);
		System.out.println("Ingresa un tamaño");
		tam = x.nextInt();
		
		return tam;
	}
	
	public void op(){
		Random r = new Random();
		arr = new int[tam];
		
		for(int i=0; i<tam; i++){
			arr[i]= r.rand%100();
		}
	}
	
	public void repetidos(){
		arr2 = new int[tam];
		for(int i=0; i<tam; i++){
			for(int j = 0; j<tam; j++){
				if(arr[i] == arr[j]){
					arr[i] = 0;
				}
			}
		}
	}
	
	public void imprimir(){
		for(int i=0; i<tam; i++){
			System.out.print(arr[i]+",");
		}
	}
	
	public static void main(String[] args){
		Repetidos re = new Repetidos();
		re.pedirNum();
		re.op();
		re.repetidos();
		re.imprimir();
	}
}