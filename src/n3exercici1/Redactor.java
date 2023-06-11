package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Redactor {
	Scanner scanner = new Scanner(System.in);
	private String nom;
	private final String dni;
	private static int sou;
	private ArrayList<Noticia> noticies;

	static {
		sou = 1500;
	}

	{
		this.noticies = new ArrayList<Noticia>();
	}

	public Redactor(String nom, String dni) {
		this.nom = nom;
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public int menuNoticia() {
		int opcio = 0;
		do {
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("1.- Futbol");
			System.out.println("2.- Basquet");
			System.out.println("3.- Tenis");
			System.out.println("4.- F1");
			System.out.println("5.- Motociclisme");
			System.out.println("0.- Sortir");
			System.out.print("Introdueix una opció: ");
			opcio = scanner.nextInt();
			scanner.nextLine();
			if (opcio < 0 || opcio > 5) {
				System.out.println("Opció incorrecta!");
			}
		} while (opcio < 0 || opcio > 5);

		return opcio;
	}

	public void introduirNoticia(int opcio) {
		switch (opcio) {
		case 1:
			introduirNoticiaFutbol();
			break;
		case 2:
			introduirNoticiaBasquet();
			break;
		case 3:
			introduirNoticiaTenis();
			break;
		case 4:
			introduirNoticiaF1();
			break;
		case 5:
			introduirNoticiaMotociclisme();
			break;
		case 0:
			break;
		}
	}

	public void introduirNoticiaFutbol() {
		System.out.println("Introdueix el titular");
		String titular = scanner.nextLine();
		System.out.println("Introdueix la competicio");
		String competicio = scanner.nextLine();
		System.out.println("Introdueix el club");
		String club = scanner.nextLine();
		System.out.println("Introdueix el jugador");
		String jugador = scanner.nextLine();
		Futbol f1 = new Futbol(titular, competicio, club, jugador);
		noticies.add(f1);
	}

	public void introduirNoticiaBasquet() {
		System.out.println("Introdueix el titular");
		String titular = scanner.nextLine();
		System.out.println("Introdueix la competicio");
		String competicio = scanner.nextLine();
		System.out.println("Introdueix el club");
		String club = scanner.nextLine();
		Basquet b1 = new Basquet(titular, competicio, club);
		noticies.add(b1);
	}

	public void introduirNoticiaTenis() {
		System.out.println("Introdueix el titular");
		String titular = scanner.nextLine();
		System.out.println("Introdueix la competicio");
		String competicio = scanner.nextLine();
		System.out.println("Introdueix el tenista");
		String tenista = scanner.nextLine();
		Tenis t1 = new Tenis(titular, competicio, tenista);
		noticies.add(t1);
	}

	public void introduirNoticiaF1() {
		System.out.println("Introdueix el titular");
		String titular = scanner.nextLine();
		System.out.println("Introdueix l'escuderia");
		String escuderia = scanner.nextLine();
		F1 f1 = new F1(titular, escuderia);
		noticies.add(f1);
	}

	public void introduirNoticiaMotociclisme() {
		System.out.println("Introdueix el titular");
		String titular = scanner.nextLine();
		System.out.println("Introdueix l'equip");
		String equip = scanner.nextLine();
		Motociclisme m1 = new Motociclisme(titular, equip);
		noticies.add(m1);
	}

	public Noticia buscarNoticia(int opcio) {
		System.out.println("Introdueix el titular");
		String titular = scanner.nextLine();
		Noticia n1 = null;

		switch (opcio) {
		case 1:
			n1 = buscarNoticiaFutbol(titular);
			break;
		case 2:
			n1 = buscarNoticiaBasquet(titular);
			break;
		case 3:
			n1 = buscarNoticiaTenis(titular);
			break;
		case 4:
			n1 = buscarNoticiaF1(titular);
			break;
		case 5:
			n1 = buscarNoticiaMotociclisme(titular);
			break;
		case 0:
			break;
		}
		return n1;
	}

	public Noticia buscarNoticiaFutbol(String titular) {
		Futbol f1 = null;
		int i = 0;
		while (i < noticies.size() && f1 == null) {
			if (noticies.get(i).getTitular().equals(titular) && noticies.get(i) instanceof Futbol) {
				f1 = (Futbol) noticies.get(i);
			} else {
				i++;
			}
		}
		if (f1 == null) {
			System.out.println("La noticia buscada no existeix a la base de dades");
		}
		return f1;
	}

	public Noticia buscarNoticiaBasquet(String titular) {
		Basquet b1 = null;
		int i = 0;
		while (i < noticies.size() && b1 == null) {
			if (noticies.get(i).getTitular().equals(titular) && noticies.get(i) instanceof Basquet) {
				b1 = (Basquet) noticies.get(i);
			} else {
				i++;
			}
		}
		if (b1 == null) {
			System.out.println("La noticia buscada no existeix a la base de dades");
		}
		return b1;
	}

	public Noticia buscarNoticiaTenis(String titular) {
		Tenis t1 = null;
		int i = 0;
		while (i < noticies.size() && t1 == null) {
			if (noticies.get(i).getTitular().equals(titular) && noticies.get(i) instanceof Tenis) {
				t1 = (Tenis) noticies.get(i);
			} else {
				i++;
			}
		}
		if (t1 == null) {
			System.out.println("La noticia buscada no existeix a la base de dades");
		}
		return t1;
	}

	public Noticia buscarNoticiaF1(String titular) {
		F1 f1 = null;
		int i = 0;
		while (i < noticies.size() && f1 == null) {
			if (noticies.get(i).getTitular().equals(titular) && noticies.get(i) instanceof F1) {
				f1 = (F1) noticies.get(i);
			} else {
				i++;
			}
		}
		if (f1 == null) {
			System.out.println("La noticia buscada no existeix a la base de dades");
		}
		return f1;
	}

	public Noticia buscarNoticiaMotociclisme(String titular) {
		Motociclisme m1 = null;
		int i = 0;
		while (i < noticies.size() && m1 == null) {
			if (noticies.get(i).getTitular().equals(titular) && noticies.get(i) instanceof Motociclisme) {
				m1 = (Motociclisme) noticies.get(i);
			} else {
				i++;
			}
		}
		if (m1 == null) {
			System.out.println("La noticia buscada no existeix a la base de dades");
		}
		return m1;
	}

	public void mostrarNoticies() {
		for (Noticia noticia : noticies) {
			System.out.println(noticia);
		}
	}

	public void eliminarNoticia(Noticia n1) {
		noticies.remove(n1);
		System.out.println("La noticia amb el titular " + n1.getTitular() + ", ha sigut eliminada de la base de dades");
	}

}
