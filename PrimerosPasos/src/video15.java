import javax.swing.*;
public class video15 {

	public static void main(String[] args) {
	String NombreUsuario=JOptionPane.showInputDialog("Introduce tu nombre:");	
	String Edad=JOptionPane.showInputDialog("�Cu�ntos a�os tienes?");
	int EdadUsuario= Integer.parseInt(Edad);
	System.out.println("Te llamas " + NombreUsuario + " y el a�o que viene tendr�s " + (EdadUsuario+1) + " a�os.");
	}

}
