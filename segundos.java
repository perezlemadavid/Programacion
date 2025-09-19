package Practicas;

import java.util.Scanner;

public class Segundos {

	public static void main(String[] args) {
		int tiempo;
		int segundos;
		int minutos;
		Scanner teclado = new Scanner (System.in);
		System.out.print("introduce el tiempo: ");
		tiempo = teclado.nextInt();
		minutos = tiempo/60;
		segundos = tiempo%60;
		System.out.print(tiempo+" segundos son "+minutos+" minutos y "+segundos+" segundos");
	

	}

}
