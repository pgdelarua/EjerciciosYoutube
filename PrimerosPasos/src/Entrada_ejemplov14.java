import java.util.*;
public class Entrada_ejemplov14 {

	public static void main(String[] args) {
		Scanner Entrada= new Scanner (System.in);
		System.out.println("Introduce tu nombre");
		String nombreusuario=Entrada.nextLine();
		//Declaramos la variable de tipo String y la llamamos de equis forma, llamamos al m�todo con el objeto delante(Entrada) ya sea nextLine(), nextInt()...
		System.out.println("Introduce tu edad");
		int edad=Entrada.nextInt();
		//Declaramos variable tipo int y la nombramos como "Edad", llamamos a su m�todo(nextInt()) con el objeto delante (Entrada)
		System.out.println ("Hola " + nombreusuario + " el a�o que viene tendr�s " + (edad+1) + " a�os.");
	}
}
