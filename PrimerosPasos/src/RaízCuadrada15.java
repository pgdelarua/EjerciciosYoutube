import javax.swing.*;
public class Ra�zCuadrada15 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduce un n�mero:");
		double num2=Double.parseDouble(num1);
		System.out.print("La ra�z cuadrada de " + num2 + " es: " );
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
