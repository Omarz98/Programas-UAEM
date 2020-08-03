package Escuela;

public class Principal{
	
	public static void main(String[] args){
		
		Escuela e = new Escuela();
		e.datosEsc();

		Alumno al = new Alumno();
		al.setEscuela( e );		

		al.datosAlum();

		al.estudiando();

	}
}
