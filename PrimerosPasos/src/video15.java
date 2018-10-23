import javax.swing.*;
public class video15 {

	public static void main(String[] args) {
	String NombreUsuario=JOptionPane.showInputDialog("Introduce tu nombre:");	
	String Edad=JOptionPane.showInputDialog("¿Cuántos años tienes?");
	int EdadUsuario= Integer.parseInt(Edad);
	System.out.println("Te llamas " + NombreUsuario + " y el año que viene tendrás " + (EdadUsuario+1) + " años.");
	}

}
