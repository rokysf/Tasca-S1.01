package n1exercici1;

public class InstrumentoPercusion extends Instrumento {

	public InstrumentoPercusion(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void tocar() {
		System.out.println("Est� sonando un instrumento de percusi�n");
	}

}
