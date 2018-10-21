
public class Video25_2daparte {

	public static void main(String[] args) {
	
			double acumulado;
			double interés=0.10;
			
			double[][] saldo=new double[6][5];
			 for (int i=0;i<6;i++) {
				 saldo [i][0]=10000; //ya que la segunda dimensión empieza en 10000 siempre en este ejemplo
				 acumulado=10000;
				 for(int j=1;j<5;j++) {  //empieza en uno porque ya hemos rellenado j=0 dándole como valor 10000
					 acumulado=acumulado+(acumulado*interés);
					 saldo [i][j]=acumulado;
					 
				 }
				 interés=interés+0.01;
			 }
			 for (int z=0; z<5; z++) { 
				 System.out.println();
				 for (int h =0; h<6; h++) { 
					 System.out.printf("%1.2f", saldo[h][z]); 
					 System.out.print(" "); } 
				 
				
			 	
				}
			 }
	}
