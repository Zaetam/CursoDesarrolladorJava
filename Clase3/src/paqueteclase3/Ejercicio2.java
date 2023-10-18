package paqueteclase3;

public class Ejercicio2 {
 public static void main(String[] args) {
	
	
	 String abecedario="abcdefghijklmnñopqrstuvwxyz";
	 String palabra="hola que tal";
	 //String palabra="ipmbrvfubm";
	 String nuevapalabra="";
	 String abecedariodoble=abecedario+abecedario;
	 String operacion="codificar";
	 
	 
	 
	 int desplazamiento=1;
	 if (desplazamiento>=abecedario.length()) {
		desplazamiento=desplazamiento%abecedario.length();
	};
		
	 System.out.println(desplazamiento);
	
	 //codificar
	 if (operacion.equals("codificar")) {
	 String palabrasinespacios=palabra.replace(" ","");
	 System.out.println(palabrasinespacios);
	 
	for (int i=0; i<palabrasinespacios.length();i++) {
		int posicionabc =abecedario.indexOf(palabrasinespacios.charAt(i));
		int nuevaposabc=posicionabc+desplazamiento;
		
		char nuevaletra=abecedariodoble.charAt(nuevaposabc);
		nuevapalabra=nuevapalabra+String.valueOf(nuevaletra);
		
	};
	
	
	 	
	 System.out.println(nuevapalabra);
	 
	 };
	 
	//decodificar
	 
	 if (operacion.equals("decodificar")) {
		 for (int i=0; i<palabra.length();i++) {
				int posicionabc =abecedario.indexOf(palabra.charAt(i));
				int nuevaposabc=posicionabc-desplazamiento;
				
				char nuevaletra=abecedariodoble.charAt(nuevaposabc);
				nuevapalabra=nuevapalabra+String.valueOf(nuevaletra);
				
		 };
		 System.out.println(nuevapalabra);
	 };
 };
}
