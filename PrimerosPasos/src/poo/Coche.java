package poo;

public class Coche {
	private int ruedas; //Para encapsular el dato int ponemos delante private y como estos datos son inviolables y los queremos igual para todos los objetos ponemos private delante de cada int.
	private int longitud; //Todos los int son características comunes a coches. Es decir, tenemos todas las características comunes para especificar este objeto coche.
	private int anchura;
	private int motorcc;
	private int peso_plataforma;
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	public Coche() {//El método constructor siempre tiene el mismo nombre que la clase
		ruedas=4;
		longitud=400;
		anchura=220;
		motorcc=1600;
		peso_plataforma=600;
	}
	public String decir_longitud() { //Método getter
		return "La longitud del coche es " + longitud; //El método getter siempre tiene un return
	}
	public void DimeColor() { //Método setter
		color="azul";
	}
	public String dime_color() { //Método getter
		return "El color del coche es: " + color;
	}
}
