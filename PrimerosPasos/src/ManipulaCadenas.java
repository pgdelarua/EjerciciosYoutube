
public class ManipulaCadenas {
	public static void main (String[] args) {
	String nombre="Sara García de la Rúa";
	System.out.println("Mi nombre es " + nombre);
	System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
	System.out.println("La primera letra del nombre " + nombre + " es la " + nombre.charAt(0));
	int Última_letra; //variable de tipo entero
		Última_letra= nombre.length(); //letras de mi nombre a través del método lenght
		System.out.println("Y la última letra de " + nombre + (" es la ") + nombre.charAt(Última_letra-1)); //porque empieza a contar desde cero (de ahí el -1)
	
	}
}
