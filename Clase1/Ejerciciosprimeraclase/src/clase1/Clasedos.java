package clase1;

public class Clasedos {
	public static void main(String[] args) {
		int numeros[]=new int[2];
		int longitud=numeros.length;
	
		
		int i;
		
		for (i=0;i<longitud;i++) {
			System.out.println("array de numeros"+numeros[i]);
		};
		
		char letras[]=new char[5];
		int longitudletras=letras.length;
		
		letras[3]='a';
		
		
		for (i=0;i<longitudletras;i++) {
			System.out.println("array de letras"+letras[i]);
		}
	
		boolean booleanos[]=new boolean [4];
		int longitudbooleano=booleanos.length;
		
		booleanos[2]=true;
		for (i=0;i<longitudbooleano;i++) {
			System.out.println("array de booleanos"+booleanos[i]);
		}
			
		String saludo="hola";
		char letrasaludo=saludo.charAt(2);
		System.out.println(saludo.charAt(2));
		
				
	}

}
