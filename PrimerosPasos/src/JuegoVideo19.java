import java.util.*;
public class JuegoVideo19 {

	public static void main(String[] args) {
		int aleatorio=(int)(Math.random()*100); //(int) sintaxis para hacer una refundición
		//System.out.println(aleatorio);	// cambiamos Math.random()*100 por aleatorio (esta línea sólo ha sido para comprobar
		Scanner entrada=new Scanner(System.in);
		int número=0;
		int intentos=0;
		while(número!=aleatorio) {
			intentos++; //al incrementar la variable intentos cada vez que entre en el bucle se incrementará en uno
			System.out.println("Introduce un número, por favor:");
			número=entrada.nextInt();
			if(aleatorio<número) {
				System.out.println("El número es menor");
			}
			else if(aleatorio>número) {
				System.out.println("El número es mayor");
			}
		}
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos. Crack.");
	}

}
