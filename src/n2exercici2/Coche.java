package n2exercici2;

public class Coche {
	
	private static final String marca = "Seat";
	private static String modelo;
	private final int potencia = 140;
	
	
	
	
	public static String getMarca() {
		return marca;
	}


	public static String getModelo() {
		return modelo;
	}

	
	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static void frenar() {
		System.out.println("El vehiculo está frenando");
	}
	
	public void acelerar() {
		System.out.println("El vehiculo está acelerando");
	}
	
	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + "]";
	}


	


	
	
	
	
	

}
