package n3exercici1;

public class Motociclisme extends Noticia {

	private String equip;
	private static int preuHondaYamaha;
	private static int puntsHondaYamaha;

	{
		super.setPreuInicial(100);
		super.setPuntuacioInicial(3);
	}

	static {
		preuHondaYamaha = 50;
		puntsHondaYamaha = 3;
	}

	public Motociclisme(String titular, String equip) {
		super(titular);
		this.equip = equip;
	}

	@Override
	public void calcularPreuNoticia() {
		int preu = super.getPreuInicial();
		if (this.equip.equals("Honda") || this.equip.equals("Yamaha")) {
			preu = preu + preuHondaYamaha;
		}
		super.setPreu(preu);
		System.out.println("El preu de la noticia es " + super.getPreu() + "€");
	}

	@Override
	public void calcularPuntuacioNoticia() {
		int puntuacio = super.getPuntuacioInicial();
		if (this.equip.equals("Honda") || this.equip.equals("Yamaha")) {
			puntuacio = puntuacio + puntsHondaYamaha;
		}
		super.setPuntuacio(puntuacio);
		System.out.println("La puntuacio de la noticia es " + super.getPuntuacio());
	}

}
