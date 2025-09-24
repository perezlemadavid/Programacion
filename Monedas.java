package Practicas;

import java.util.Scanner;

public class Monedas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el Valor:");
		double Valor = teclado.nextDouble();
		int centimos = (int)(Valor*100+0.5);
		int moneda1 = centimos/100;
		centimos %= 100; 
		int moneda050 = centimos/50;
		centimos %= 50;
		int moneda020 = centimos/20;
		centimos %= 20;
		int moneda010 = centimos/10;
		centimos %= 10;
		int moneda005 = centimos/5;
		centimos %= 5;
		int moneda002 = centimos/2;
		centimos %= 2;
		int moneda001 = centimos/1;
		 System.out.println("Desglose:");
        System.out.println(moneda1 + " monedas de 1€");
        System.out.println(moneda050 + " monedas de 0.50€");
        System.out.println(moneda020 + " monedas de 0.20€");
        System.out.println(moneda010 + " monedas de 0.10€");
        System.out.println(moneda005 + " monedas de 0.05€");
        System.out.println(moneda002 + " monedas de 0.02€");
        System.out.println(moneda001 + " monedas de 0.01€");
		

	}

}
