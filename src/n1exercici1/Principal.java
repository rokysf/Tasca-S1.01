package n1exercici1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstrumentoCuerda cuerda1 = new InstrumentoCuerda("guitarra", 125.36);
		InstrumentoPercusion percusion1 = new InstrumentoPercusion("tambor", 59);
		InstrumentoViento viento1 = new InstrumentoViento("flauta", 24.50);

		cuerda1.tocar();
		percusion1.tocar();
		viento1.tocar();

	}

}
