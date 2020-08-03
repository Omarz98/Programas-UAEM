package extra;

import java.util.Scanner;
import java.util.ArrayList;


public class Conjetura{
	
	private ArrayList<Integer> arr = new ArrayList<Integer>(); 
	private int num;
	
	
	public int pedirNum(){
		Scanner x = new Scanner(System.in);
		System.out.println("Ingresa un numero entero");
		num = x.nextInt();
		
		return num;
	}
	
	public void op(){
		int i=0;
		while(num!=1){
			
			if(num % 2 == 0){
				num = num/2;
			}else {
				num = (num*3) + 1;
			}
			
			arr.add(i,num);
			i++;
		}
		
	}
	
	public void imprimir(){
		
		for(int i = 0; i< arr.size(); i++){
			System.out.print(arr.get(i)+",");
		}
	}
	
	public static void main(String[] args){
		
		Conjetura c = new Conjetura();
		c.pedirNum();
		c.op();
		c.imprimir();
		
	}
	
}