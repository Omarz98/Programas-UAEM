package Ordinario;
import java.util.Scanner;

public class Segundos{
	
	private int seg,hor,min,segundos;
	
	
	public Segundos(){
		
	}
	
	public void setSeg(int seg){
		this.seg = seg;
	}
	
	public int getSeg(){
		return seg;
	}
	
	public void pedirDatos(){
		Scanner x = new Scanner(System.in);
		
		System.out.println("Ingresa los segundos: ");
		seg = x.nextInt();
	}
	
	public String toString(){
		String cad = "";
		return cad;
	}
	
	public int op(){
		int aux;
		//hor = seg/60;
		//min = seg%60;
		hor= seg%60;
		aux= hor;
		if((seg%60) > 60){
			segundos = min/60;
		}
		
	}
	
	
}