
public class UsoArrays3Video24 {

	public static void main(String[] args) {
		int[]matriz_aleat=new int [150];
		for (int i=0;i<matriz_aleat.length;i++){
			matriz_aleat[i]=(int)Math.round(Math.random()*100); //int es una refundici�n dado que math random nos da un double. Math.round nos redondea
		}
		for (int n�meros:matriz_aleat) {
			System.out.print(n�meros + "-");
		}
	}

}
