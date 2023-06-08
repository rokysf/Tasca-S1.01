package n1exercici1;

public class InstrumentoPercusion extends Instrumento {

	public InstrumentoPercusion(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de percusión");
	}

}
