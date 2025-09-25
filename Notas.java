package Practicas;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("introduce una nota :");
		double Nota = teclado.nextDouble();
		if (Nota>=5) {
			if (Nota<7) System.out.println("bien");
			else {
				if (Nota>=7) {
					if (Nota<9) System.out.println("Notable");
					else {
						if (Nota>=9) {
							if (Nota<11) System.out.println("Sobresaliente");
							
						}
							
						}
				}
			}
		}
		else {
			if (Nota<=5) System.out.println("suspenso");
				
		}
		

	}

}
