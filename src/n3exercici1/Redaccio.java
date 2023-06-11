package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Redaccio {
	Scanner scanner = new Scanner(System.in);
	private ArrayList<Redactor> redactors;

	{
		this.redactors = new ArrayList<Redactor>();
	}

	public void introduirRedactor() {
		System.out.println("Introdueix el nom del redactor");
		String nom = scanner.nextLine();
		System.out.println("Introdueix el DNI del redactor");
		String dni = scanner.nextLine();
		Redactor r1 = new Redactor(nom, dni);
		redactors.add(r1);
	}

	public Redactor buscarRedactor() {
		System.out.println("Introdueix el DNI del redactor");
		String dniBuscat = scanner.nextLine();
		Redactor r1 = null;
		int i = 0;
		while (i < redactors.size() && r1 == null) {
			if (redactors.get(i).getDni().equals(dniBuscat)) {
				r1 = redactors.get(i);
			} else {
				i++;
			}
		}
		if (r1 == null) {
			System.out.println("El redactor buscat no existeix a la base de dades");
		}
		return r1;
	}

	public void eliminarRedactor(Redactor r1) {
		if (r1 != null) {
			redactors.remove(r1);
			System.out.println("El redactor amb el DNI " + r1.getDni() + ", ha sigut eliminat de la base de dades");
		}
	}

}
