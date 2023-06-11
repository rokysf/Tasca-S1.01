package n3exercici1;

public class F1 extends Noticia {

	private String escuderia;
	private static int preuFerrariMercedes;
	private static int puntsFerrariMercedes;

	{
		super.setPreuInicial(100);
		super.setPuntuacioInicial(4);
	}

	static {
		preuFerrariMercedes = 50;
		puntsFerrariMercedes = 2;
	}

	public F1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}

	@Override
	public void calcularPreuNoticia() {
		int preu = super.getPreuInicial();
		if (this.escuderia.equals("Ferrari") || this.escuderia.equals("Mercedes")) {
			preu = preu + preuFerrariMercedes;
		}
		super.setPreu(preu);
		System.out.println("El preu de la noticia es " + super.getPreu() + "€");
	}

	@Override
	public void calcularPuntuacioNoticia() {
		int puntuacio = super.getPuntuacioInicial();
		if (this.escuderia.equals("Ferrari") || this.escuderia.equals("Mercedes")) {
			puntuacio = puntuacio + puntsFerrariMercedes;
		}
		super.setPuntuacio(puntuacio);
		System.out.println("La puntuacio de la noticia es " + super.getPuntuacio());
	}

}
