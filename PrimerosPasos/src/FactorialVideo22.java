import javax.swing.*;
public class FactorialVideo22 {

	public static void main(String[] args) {
		int resultado=1;
		int n�mero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero, por favor:"));
		
			for(int i=n�mero;i>0;i--) {
				resultado=resultado*i;
			}
			System.out.println("El factorial de " + n�mero + " es: " + resultado);
	}

}
