package n1exercici1;

public abstract class Instrumento {

	private String nombre;
	private double precio;

	public Instrumento(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	static {
		System.out.println("Bloque de inicialización estatico");
	}

	{
		System.out.println("Bloque de inicialización");
	}

	public abstract void tocar();

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", precio=" + precio + "]";
	}

}