import java.util.*;
import javax.swing.*;
public class �reasvideo17 {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	System.out.println("Elige una opci�n: \n1:cuadrado \n2:rect�ngulo \n3:tri�ngulo \n4:c�rculo");
		int figura=entrada.nextInt();
		switch(figura){
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida del lado en cm")); /*Joptio... es un m�todo est�tico que nos permite crear una caja donde introducremos datos acompa�ada de dos botones. 
																					Adem�s devuelve un string por lo que se debe usar el m�todo parseInt para convertir*/
			System.out.println("El �rea del cuadrado es:" + Math.pow(lado, 2) + " cm."); //Math.pow crea un n�mero=lado y un exponente=2
			break;
			
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base en cm"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
			System.out.println("El �rea del rect�ngulo es:" + base*altura + " cm.");
			break;
			
		case 3:
		 base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base en cm"));
		 altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
		 System.out.println("El �rea del tri�ngulo es:" + (base*altura)/2 + " cm.");
		 break;
		 
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio en cm"));
			System.out.print("El �rea del c�culo es ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2))); //system...f nos permite imprimir con formato. Math.PI  es una constante predefinida en la api de java
			System.out.print(" cm.");
			break;
			default:
				System.out.println("La opci�n no es correcta");
		}
	}

}
