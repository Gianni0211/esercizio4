package Esercizio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un nome");
		String name = scanner.nextLine();
		System.out.println("Vorresti un saluto formale (digita Y), o un saluto informale (digita N)?");

		String resp = scanner.nextLine();
		
		

		ISalutatore salutatore;
		while(!resp.equals("N") && !resp.equals("Y")) {
			System.out.println("Inserisci un valida lettera");
			resp = scanner.nextLine();

		}
		if (resp.equals("N")) {
			System.out.println("Che ore sono?");
			salutatore = new SalutoInformale();

			int ora = scanner.nextInt();
			ora = controllaOra(ora,  scanner);
			saluta(ora, scanner, name, salutatore);
		} else {
			salutatore = new SalutoFormale();
			System.out.println("Che ore sono?");
			int ora = scanner.nextInt();
			ora = controllaOra(ora, scanner);
			saluta(ora, scanner, name, salutatore);

		}

	}
	
	
	static  void saluta(int ora, Scanner scanner, String name, ISalutatore salutatore) {
		
		if (ora >= 6 && ora <= 13) {
			System.out.println(salutatore.salutaMattino(name));
		} else if (ora >= 14 && ora <= 22) {
			System.out.println(salutatore.salutaSera(name));
		} else   {
			
			System.out.println(salutatore.salutaNotte(name));
		}
	}
	static int controllaOra(int ora, Scanner scanner) {
		while(ora > 24) {
			System.out.println("Inserisci un orario da 0 a 24");
			ora = scanner.nextInt();
			
		}
		return ora;
	}

}
