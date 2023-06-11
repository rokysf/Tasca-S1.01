package n3exercici1;

public class Tenis extends Noticia {

	private String competicio;
	private String tenista;
	private static int preuTenista;
	private static int puntsTenista;

	{
		super.setPreuInicial(150);
		super.setPuntuacioInicial(4);
	}

	static {
		preuTenista = 100;
		puntsTenista = 3;
	}

	public Tenis(String titular, String competicio, String tenista) {
		super(titular);
		this.competicio = competicio;
		this.tenista = tenista;
	}

	@Override
	public void calcularPreuNoticia() {
		int preu = super.getPreuInicial();
		if (this.tenista.equals("Federer") || this.tenista.equals("Nadal") || this.tenista.equals("Djokovic")) {
			preu = preu + preuTenista;
		}
		super.setPreu(preu);
		System.out.println("El preu de la noticia es " + super.getPreu() + "€");
	}

	@Override
	public void calcularPuntuacioNoticia() {
		int puntuacio = super.getPuntuacioInicial();
		if (this.tenista.equals("Federer") || this.tenista.equals("Nadal") || this.tenista.equals("Djokovic")) {
			puntuacio = puntuacio + puntsTenista;
		}
		super.setPuntuacio(puntuacio);
		System.out.println("La puntuacio de la noticia es " + super.getPuntuacio());
	}

	@Override
	public String toString() {
		return "Tenis [competicio=" + competicio + ", tenista=" + tenista + ", Titular()=" + getTitular() + "]";
	}

}
