
public class ManipulaCadenas {
	public static void main (String[] args) {
	String nombre="Sara Garc�a de la R�a";
	System.out.println("Mi nombre es " + nombre);
	System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
	System.out.println("La primera letra del nombre " + nombre + " es la " + nombre.charAt(0));
	int �ltima_letra; //variable de tipo entero
		�ltima_letra= nombre.length(); //letras de mi nombre a trav�s del m�todo lenght
		System.out.println("Y la �ltima letra de " + nombre + (" es la ") + nombre.charAt(�ltima_letra-1)); //porque empieza a contar desde cero (de ah� el -1)
	
	}
}
