package n3exercici1;

public abstract class Noticia {

	private String titular;
	private String text;
	private int puntuacio;
	private int preu;
	private int preuInicial;
	private int puntuacioInicial;

	{
		this.text = "";
	}

	public Noticia(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	public int getPuntuacioInicial() {
		return puntuacioInicial;
	}

	public void setPuntuacioInicial(int puntuacioInicial) {
		this.puntuacioInicial = puntuacioInicial;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	public int getPreuInicial() {
		return preuInicial;
	}

	public void setPreuInicial(int preuInicial) {
		this.preuInicial = preuInicial;
	}

	public abstract void calcularPreuNoticia();

	public abstract void calcularPuntuacioNoticia();

}
