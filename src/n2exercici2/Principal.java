package n2exercici2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//No se puede inicializar ningun atributo de la clase en el constructor
	//porque los 2 estaticos son atributos de clase y el final no puede variar
	//el valor	
	
	System.out.println(Coche.getMarca());
	System.out.println(Coche.getModelo());
	Coche.setModelo("Ibiza");
	System.out.println(Coche.getModelo());
	Coche coche1 = new Coche();
	System.out.println(coche1);
	
	//Como invocar el metodo estatico frenar y el metodo acelerar
	//El metodo statico es un metodo de clase, por lo tanto no hace falta instanciar
	//un objeta para poder llamarlo
	
	Coche.frenar();
	coche1.acelerar();
	
	}
	
}
