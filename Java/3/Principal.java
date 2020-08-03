package Escuela;

public class Principal{
	
	public static void main(String[] args){
		
		Escuela e = new Escuela();
		e.datosEsc();

		Escuela e2 = new Escuela();
		e2.datosEsc();

		Alumno al = new Alumno();
		al.setEscuela( e );		
		al.setEscuela( e2 );		

		al.datosAlum();

		al.estudiando();

	}
}
