import javax.swing.*;
public class Video20_2PesoIdeal {

	public static void main(String[] args) {
		String género="";
		do {
			género=JOptionPane.showInputDialog("Introduce tu género (M/F)");
		}
		while (género.equalsIgnoreCase("M")==false && género.equalsIgnoreCase("F")==false); /*Lo que está dentro de "do" se repetirá mientras se de las condiciones de "while". 
																								Además el método equalsIgnoreCase no precisa en mayúscula o no al contrario del método equals(a secas)*/
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm")); /*ShowInputDialog devuelve SIEMPRE un string y son estáticos por eso utilizamos la clase a la que pertenecen
																								justo delante, en este caso JOptionPane. Lo que nos dé este método le estamos diciendo que nos lo pase a  int de ahí el parseInt con el nombre de la clase delante (Integer)*/
		int pesoideal=0;
		if(género.equalsIgnoreCase("M")) {
			pesoideal=altura-110;
		}
		else if(género.equalsIgnoreCase("F")) {
			pesoideal=altura-120;
		}
		System.out.print("Tu peso ideal es: " + pesoideal + " Kgs.");
	}
}