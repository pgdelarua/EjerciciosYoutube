import java.util.*;
public class JuegoVideo19 {

	public static void main(String[] args) {
		int aleatorio=(int)(Math.random()*100); //(int) sintaxis para hacer una refundici�n
		//System.out.println(aleatorio);	// cambiamos Math.random()*100 por aleatorio (esta l�nea s�lo ha sido para comprobar
		Scanner entrada=new Scanner(System.in);
		int n�mero=0;
		int intentos=0;
		while(n�mero!=aleatorio) {
			intentos++; //al incrementar la variable intentos cada vez que entre en el bucle se incrementar� en uno
			System.out.println("Introduce un n�mero, por favor:");
			n�mero=entrada.nextInt();
			if(aleatorio<n�mero) {
				System.out.println("El n�mero es menor");
			}
			else if(aleatorio>n�mero) {
				System.out.println("El n�mero es mayor");
			}
		}
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos. Crack.");
	}

}
