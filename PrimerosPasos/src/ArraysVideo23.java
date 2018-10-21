/*Una matriz/array es una estructura de datos que contiene una colecci�n de valores del mismo tipo. Sirve para almacenar valores que tienen una relaci�n entre s�
Su sintaxis es la siguiente: int[] mi_matriz=new int/double/string[10]; (almacenar�a 10 valores). Las matrices tienen posicionamiento, empezando desde 0.
Se puede declarar y dar valor de una vez. Usaremos: int[] mi_matriz= {2,6,8,4,9};
El bucle for se suele utilizar para recorrer y ver los valores que hay en su interior.El bucle FOR a la hora de rellenar una matriz con valores y a la hora de leer una matriz con valores*/


public class ArraysVideo23 {
	public static void main (String[] args) {
		/*int [] PrimerArray=new int[5]; //tambi�n int PrimerArray[]
		PrimerArray[0]=5;
		PrimerArray[1]=38;
		PrimerArray[2]=-15;
		PrimerArray[3]=92;
		PrimerArray[4]=71;ESTO ES UNA FORMA DE DECLARAR LAS VARIABLES. LA OTRA FORMA ES LA QUE SIGUE*/
		
		int[] PrimerArray= {5, 38, -16, 92, 71, 42, 45, 96, 28, 47, 26};
		/*En casos en los que la matriz tenga muchos valores una forma de saber su logitud e indic�rsela al bucle for ser�a la siguiente: En este caso-> for( int i=0; i<PrimerArray.length;i++)*/
		
		/*System.out.println(PrimerArray[3]);
		System.out.println(PrimerArray[4]);
		System.out.println(PrimerArray[2]);
		System.out.println(PrimerArray[0]);
		System.out.println(PrimerArray[1]); ESTO SER�A UNA INSTRUCCI�N POSIBLE. OTRA FORMA SER�A CON EL BUCLE FOR*/
		
		//for(int i=0;i<5;i++)//
		for(int i=0;i<PrimerArray.length;i++){
			System.out.println("El valor del �ndice "+ i + " es igual a: " + PrimerArray[i]);
			
		}
		System.out.println("El n�mero de n�meros escritos es igual a: " + PrimerArray.length);
	}
}
