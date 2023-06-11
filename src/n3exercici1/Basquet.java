package n3exercici1;

public class Basquet extends Noticia {

	private String competicio;
	private String club;
	private static int preuEurolliga;
	private static int preuBarçaMadrid;
	private static int puntsEurolliga;
	private static int puntsAcb;
	private static int puntsBarçaMadrid;

	{
		super.setPreuInicial(250);
		super.setPuntuacioInicial(4);
	}

	static {
		preuEurolliga = 75;
		preuBarçaMadrid = 75;
		puntsEurolliga = 3;
		puntsAcb = 2;
		puntsBarçaMadrid = 1;
	}

	public Basquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
	}

	@Override
	public void calcularPreuNoticia() {
		int preu = super.getPreuInicial();
		if (this.competicio.equals("Eurolliga")) {
			preu = preu + preuEurolliga;
		}
		if (this.club.equals("Barça") || this.club.equals("Madrid")) {
			preu = preu + preuBarçaMadrid;
		}
		super.setPreu(preu);
		System.out.println("El preu de la noticia es " + super.getPreu() + "€");
	}

	@Override
	public void calcularPuntuacioNoticia() {
		int puntuacio = super.getPuntuacioInicial();
		if (this.competicio.equals("Eurolliga")) {
			puntuacio = puntuacio + puntsEurolliga;
		} else if (this.competicio.equals("ACB")) {
			puntuacio = puntuacio + puntsAcb;
		}
		if (this.club.equals("Barça") || this.club.equals("Madrid")) {
			puntuacio = puntuacio + puntsBarçaMadrid;
		}
		super.setPuntuacio(puntuacio);
		System.out.println("La puntuacio de la noticia es " + super.getPuntuacio());
	}

	@Override
	public String toString() {
		return "Basquet [competicio=" + competicio + ", club=" + club + ", Titular()=" + getTitular() + "]";
	}

}
