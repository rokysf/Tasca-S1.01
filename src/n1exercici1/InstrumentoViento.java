package n1exercici1;

public class InstrumentoViento extends Instrumento {

	public InstrumentoViento(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de viento");

	}

}
