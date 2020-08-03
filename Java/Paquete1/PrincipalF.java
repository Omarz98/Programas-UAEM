package Paquete1;

public class PrincipalF{
	
	public static void main(String[] args){
		Fecha obj = new Fecha();
		Fecha obj2 = new Fecha(8);
		System.out.println("Dia obj1: "+ obj.getDia() );
		System.out.println("DiA OBJ2: "+obj2.getDia() );

		System.out.println(obj.toString() );
		System.out.println(obj2.toString() );

		//obj2.anio =  2019;

		obj2.setAnio(2018);

		System.out.println(obj2.toString() );
	}

}
