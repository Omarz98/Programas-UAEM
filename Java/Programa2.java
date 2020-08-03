
import java.util.Scanner;

public class Programa2{

  public static void main(String[] args) {

    double descuento, precio, total,boletos;

    Scanner x = new Scanner(System.in);

    System.out.println("Ingresa los boletos:");

    boletos = x.nextFloat();

    System.out.println("Ingresa el precio de los boletos: ");

    precio = x.nextFloat();

    if (boletos>8){
    	descuento = (boletos*precio)*(0.25);
    }else if (boletos > 4 && boletos < 9) {
    	descuento = (boletos*precio)*(0.15);
    }else{
    	descuento = 0;
    }

    total = (boletos*precio)- descuento;

    System.out.println("Descuento: "+descuento);

    System.out.println("Total: "+total);

  }
}
