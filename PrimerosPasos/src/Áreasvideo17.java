import java.util.*;
import javax.swing.*;
public class Áreasvideo17 {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	System.out.println("Elige una opción: \n1:cuadrado \n2:rectángulo \n3:triángulo \n4:círculo");
		int figura=entrada.nextInt();
		switch(figura){
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida del lado en cm")); /*Joptio... es un método estático que nos permite crear una caja donde introducremos datos acompañada de dos botones. 
																					Además devuelve un string por lo que se debe usar el método parseInt para convertir*/
			System.out.println("El área del cuadrado es:" + Math.pow(lado, 2) + " cm."); //Math.pow crea un número=lado y un exponente=2
			break;
			
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base en cm"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
			System.out.println("El área del rectángulo es:" + base*altura + " cm.");
			break;
			
		case 3:
		 base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base en cm"));
		 altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
		 System.out.println("El área del triángulo es:" + (base*altura)/2 + " cm.");
		 break;
		 
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio en cm"));
			System.out.print("El área del cículo es ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2))); //system...f nos permite imprimir con formato. Math.PI  es una constante predefinida en la api de java
			System.out.print(" cm.");
			break;
			default:
				System.out.println("La opción no es correcta");
		}
	}

}
