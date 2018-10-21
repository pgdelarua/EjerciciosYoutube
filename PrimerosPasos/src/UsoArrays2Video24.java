import javax.swing.*;
public class UsoArrays2Video24 {

	public static void main(String[] args) {
		String países[]=new String[8];
		for (int i=0;i<8;i++) {
			países[i]=JOptionPane.showInputDialog("Introduce un país: " + (i+1));
		}
		for (String elemento:países){
			System.out.println("País: " + elemento);
		}
	}

}
