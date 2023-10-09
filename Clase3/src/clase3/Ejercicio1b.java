package clase3;

public class Ejercicio1b {
	
	public static void main(String[] args) {
			
		int numero1=3;
		int numero2=1;
		int numero3=10;
		boolean ordenascendente= true;
		int menor;
		int mayor;
		int medio;
		int vector[]=new int[3];
		
			
		if (numero1<numero2) {
			menor=numero1;
			mayor=numero2;
		
		}else {
			menor=numero2;
			mayor=numero1;
			};
			
		
		if(numero3<=menor) {
			medio=menor;
			menor=numero3;
		}else {
			if(numero3>mayor) {
				medio=mayor;
				mayor=numero3;
			}else {
				medio=numero3;
			};
	
		};
		
		if(ordenascendente) {
			
			vector[0]=menor;
			vector[1]=medio;
			vector[2]=mayor;
		
		}else {
			vector[0]=mayor;
			vector[1]=medio;
			vector[2]=menor;
		};
		
		System.out.println(vector[0]);
		System.out.println(vector[1]);
		System.out.println(vector[2]);
		
};
}
				


