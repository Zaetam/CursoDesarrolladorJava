package clase3;

public class Ejercicio1c {
	
	public static void main(String[] args) {
		
	//dado un vector de números, y un número X, 
	//que sume todos los números >X y retorne el resultado
	
	int vectorarray[]=new int[] {1,2,3,4,5};
	int x=1;
	int suma=0;
	
	for (int numero:vectorarray) {
		if(numero>x) {
			suma= suma+numero;
		};
	};
	
	System.out.println(suma);
	


};

}
