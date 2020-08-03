package Ordinario;

import java.util.Scanner;
import java.util.ArrayList;

public class Vocales{
	
	ArrayList<String> arr = new ArrayList<String>();
	//private String[] arr = new String[10];
	
	public Vocales(){
		
		
	}
	
	public void pedirDatos(){
		//Scanner x = new Scanner(System.in);
		
		System.out.println("Ingresa nombre completo no mas de 10 cracteres: ");
		arr.add();
	}
	
	public void operaciones(){
		
		int acum1=0,acum2=0,acum3=0,acum4=0,acum5=0;
		for(int i=0 ; i< arr.size();i++){
			if(arr[i]== 'a' || arr[i] == 'A'){
				acum1 = acum1 + 1;
			}else if(arr[i]== 'e' || arr[i] == 'E'){
				acum2 = acum2 + 1;
			}else if(arr[i]== 'i' || arr[i] == 'I'){
				acum3 = acum3 + 1;
			}else if(arr[i]== 'o' || arr[i] == 'O'){
				acum4 = acum4 + 1;
			}else if(arr[i]== 'u' || arr[i] == 'U'){
				acum5 = acum5 + 1;
			}
		}
		
		System.out.println("Letras a:"+ acum1 +"\nLetras e: " + acum2 + "\nLetras i: " + acum3 + "\nLetras o: "+ acum4+ "\nLetras u: "+acum5);
	}
	
	public static void main(String[] args){
		Vocales v = new Vocales();
		v.pedirDatos();
		v.operaciones();
	}
	
}