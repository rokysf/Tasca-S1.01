package n3exercici1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Redaccio redaccio1 = new Redaccio();

		int opcio = 0;
		do {
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("1.- Introduir redactor");
			System.out.println("2.- Eliminar redactor");
			System.out.println("3.- Introduir notícia a un redactor");
			System.out.println("4.- Eliminar notícia");
			System.out.println("5.- Mostrar totes les notícies per redactor");
			System.out.println("6.- Calcular puntuació de la notícia");
			System.out.println("7.- Calcular preu notícia");
			System.out.println("0.- Sortir");
			System.out.print("Introdueix una opció: ");
			opcio = scanner.nextInt();
			scanner.nextLine();
			
			Redactor r1;
			Noticia n1;
			int op;
			
			switch (opcio) {
			case 1:
				redaccio1.introduirRedactor();
				break;
			case 2:
				r1 = redaccio1.buscarRedactor();
				redaccio1.eliminarRedactor(r1);
				break;
			case 3:
				r1 = redaccio1.buscarRedactor();
				op = r1.menuNoticia();
				r1.introduirNoticia(op);
				break;
			case 4:
				r1 = redaccio1.buscarRedactor();
				op = r1.menuNoticia();
				n1 = r1.buscarNoticia(op);
				r1.eliminarNoticia(n1);
				break;
			case 5:
				r1 = redaccio1.buscarRedactor();
				r1.mostrarNoticies();
				break;
			case 6:
				r1 = redaccio1.buscarRedactor();
				op = r1.menuNoticia();
				n1 = r1.buscarNoticia(op);
				n1.calcularPuntuacioNoticia();
				break;
			case 7:
				r1 = redaccio1.buscarRedactor();
				op = r1.menuNoticia();
				n1 = r1.buscarNoticia(op);
				n1.calcularPreuNoticia();
				break;
			case 0:
				System.out.println("Fins aviat!");
				break;
			default:
				System.out.println("Opció incorrecta!");
			}

		} while (opcio != 0);

	}

}
