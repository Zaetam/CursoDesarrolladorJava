package clase3;

public class Ejercicio1a {
	public static void main(String[] args) {
		
		//que cuente la cantidad de apariciones de la letra  
	
		String cadena="calesita";
		char letra='a';
		int j=0;
		
		for (int i=0; i<cadena.length();i++) {
			System.out.println(cadena.charAt(i));
			if(cadena.charAt(i)==letra) {
				 j=j+1;
				 System.out.println(j);
			};
		};
		
	};
}
