package proyecto01;

import java.util.Scanner;

public class prog_04 {

	public static void main(String[] args) {
		double volumen;
		Scanner leerradio = new Scanner(System.in);
		int radio =0;
		System.out.println("Introduce el radio de la esfera");
		volumen = (4 * (Math.PI) * (Math.pow(radio,3))/3);
		System.out.println("El volumen de la esfera cuyo radio "+radio+" es"+volumen);
		System.out.println("Finalizado Version 1"); 
	}

}
