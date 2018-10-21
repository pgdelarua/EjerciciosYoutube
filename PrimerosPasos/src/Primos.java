
public class Primos {

	public static void main(String[] args) {
		int número, divisor;
		int ContadorDivisores;
			for(número=1; número<=100; número++) {
				ContadorDivisores=1;
				for (divisor=2; divisor<=100; divisor++){
					if (número%divisor==0){
						ContadorDivisores++;
					}
				}
				if (ContadorDivisores==2) {
					System.out.println("Número Primo: " + número);
				}

}
}
}