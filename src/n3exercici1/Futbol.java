package n3exercici1;

public class Futbol extends Noticia {

	private String competicio;
	private String club;
	private String jugador;
	private static int preuLligaCampions;
	private static int preuBarçaMadrid;
	private static int preuFerranBenzema;
	private static int puntsLligaCampions;
	private static int puntsLliga;
	private static int puntsBarçaMadrid;
	private static int puntsFerranBenzema;

	{
		super.setPreuInicial(300);
		super.setPuntuacioInicial(5);
	}

	static {
		preuLligaCampions = 100;
		preuBarçaMadrid = 100;
		preuFerranBenzema = 50;
		puntsLligaCampions = 3;
		puntsLliga = 2;
		puntsBarçaMadrid = 1;
		puntsFerranBenzema = 1;
	}

	public Futbol(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}

	@Override
	public void calcularPreuNoticia() {
		int preu = super.getPreuInicial();
		if (this.competicio.equals("Lliga de Campions")) {
			preu = preu + preuLligaCampions;
		}
		if (this.club.equals("Barça") || this.club.equals("Madrid")) {
			preu = preu + preuBarçaMadrid;
		}
		if (this.jugador.equals("Ferran Torres") || this.jugador.equals("Benzema")) {
			preu = preu + preuFerranBenzema;
		}
		super.setPreu(preu);
		System.out.println("El preu de la noticia es " + super.getPreu() + "€");
	}

	@Override
	public void calcularPuntuacioNoticia() {
		int puntuacio = super.getPuntuacioInicial();
		if (this.competicio.equals("Lliga de Campions")) {
			puntuacio = puntuacio + puntsLligaCampions;
		} else if (this.competicio.equals("Lliga")) {
			puntuacio = puntuacio + puntsLliga;
		}
		if (this.club.equals("Barça") || this.club.equals("Madrid")) {
			puntuacio = puntuacio + puntsBarçaMadrid;
		}
		if (this.jugador.equals("Ferran Torres") || this.jugador.equals("Benzema")) {
			puntuacio = puntuacio + puntsFerranBenzema;
		}
		super.setPuntuacio(puntuacio);
		System.out.println("La puntuacio de la noticia es " + super.getPuntuacio());
	}

	@Override
	public String toString() {
		return "Futbol [competicio=" + competicio + ", club=" + club + ", jugador=" + jugador + ", Titular()="
				+ getTitular() + "]";
	}

}
