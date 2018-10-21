import javax.swing.*;
public class FactorialVideo22 {

	public static void main(String[] args) {
		int resultado=1;
		int número=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número, por favor:"));
		
			for(int i=número;i>0;i--) {
				resultado=resultado*i;
			}
			System.out.println("El factorial de " + número + " es: " + resultado);
	}

}
