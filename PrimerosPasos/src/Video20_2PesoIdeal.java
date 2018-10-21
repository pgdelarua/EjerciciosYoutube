import javax.swing.*;
public class Video20_2PesoIdeal {

	public static void main(String[] args) {
		String g�nero="";
		do {
			g�nero=JOptionPane.showInputDialog("Introduce tu g�nero (M/F)");
		}
		while (g�nero.equalsIgnoreCase("M")==false && g�nero.equalsIgnoreCase("F")==false); /*Lo que est� dentro de "do" se repetir� mientras se de las condiciones de "while". 
																								Adem�s el m�todo equalsIgnoreCase no precisa en may�scula o no al contrario del m�todo equals(a secas)*/
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm")); /*ShowInputDialog devuelve SIEMPRE un string y son est�ticos por eso utilizamos la clase a la que pertenecen
																								justo delante, en este caso JOptionPane. Lo que nos d� este m�todo le estamos diciendo que nos lo pase a  int de ah� el parseInt con el nombre de la clase delante (Integer)*/
		int pesoideal=0;
		if(g�nero.equalsIgnoreCase("M")) {
			pesoideal=altura-110;
		}
		else if(g�nero.equalsIgnoreCase("F")) {
			pesoideal=altura-120;
		}
		System.out.print("Tu peso ideal es: " + pesoideal + " Kgs.");
	}
}