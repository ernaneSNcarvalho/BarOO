package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sexo: ");
		char gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		int beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int barbecue = sc.nextInt();
		
		Bill b = new Bill(gender, beer,  barbecue, softDrink);
		
		System.out.println("RELATORIO: ");		
		System.out.printf("Consumo = R$ %.2f%n", b.feeding());		
		if(b.cover() == 0.0) {
			System.out.println("Isento de couvert");
		}else {
			System.out.printf("Couvert = R$ %.2f%n", b.cover());
		}
		System.out.printf("Ingresso = R$ %.2f%n", b.ticket());
		System.out.printf("Valor a pagar = R$ %.2f%n", b.total());
		
		sc.close();
	}

}
