package Escuela;

public class Principal{
	
	public static void main(String[] args){
		
		Escuela e = new Escuela();
		e.datosEsc();
	

		Escuela[] arrEsc = new Escuela[10];
		
		for(int i=0; i<10;i++){
			arrEsc[i] = new Escuela();		
		}
		arrEsc[0].datosEsc();
		arrEsc[1].datosEsc();
		arrEsc[9].datosEsc();

		Alumno al = new Alumno();
		al.setEscuela2( e );		
		
		al.datosAlum();

		al.estudiando();

	}
}
