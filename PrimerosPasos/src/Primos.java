
public class Primos {

	public static void main(String[] args) {
		int n�mero, divisor;
		int ContadorDivisores;
			for(n�mero=1; n�mero<=100; n�mero++) {
				ContadorDivisores=1;
				for (divisor=2; divisor<=100; divisor++){
					if (n�mero%divisor==0){
						ContadorDivisores++;
					}
				}
				if (ContadorDivisores==2) {
					System.out.println("N�mero Primo: " + n�mero);
				}

}
}
}