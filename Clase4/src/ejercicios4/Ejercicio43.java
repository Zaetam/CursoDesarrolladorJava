package ejercicios4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio43 {
	
		 public static void main(String[] args) {
		
			 String abecedario="abcdefghijklmnñopqrstuvwxyz";
			 String palabra="";
			 String operacion=args[0];
			 int desplazamiento=Integer.parseInt(args[1]);
			 		 
			 try {
				for(String linea:Files.readAllLines(Paths.get("Archivo ejercicio 43.txt"))){
					palabra=palabra+linea;
				};
			 } catch(IOException e) {
				e.printStackTrace();
				System.out.println("error en la lectura");
			 };
				
			


			String nuevapalabra="";
			String abecedariodoble=abecedario+abecedario;
			if (desplazamiento>=abecedario.length()) {
				desplazamiento=desplazamiento%abecedario.length();
			};
			
			//codificar
			 
			if (operacion.equals("codificar")){
			 
				String palabrasinespacios=palabra.replace(" ","");
			 
				for (int i=0; i<palabrasinespacios.length();i++) {
					int posicionabc =abecedario.indexOf(palabrasinespacios.charAt(i));
					int nuevaposabc=posicionabc+desplazamiento;
				
					char nuevaletra=abecedariodoble.charAt(nuevaposabc);
					nuevapalabra=nuevapalabra+String.valueOf(nuevaletra);
				};
			};
			 
			if(operacion.equals("decodificar")) {
				for (int i=0; i<palabra.length();i++) {
					int posicionabc =abecedario.indexOf(palabra.charAt(i));
					int nuevaposabc=posicionabc-desplazamiento;
							
					char nuevaletra=abecedariodoble.charAt(nuevaposabc);
					nuevapalabra=nuevapalabra+String.valueOf(nuevaletra);
							
				};
			};
			
						
			try {
				Files.writeString(Paths.get("Archivo salida ejercicio 43.txt"),nuevapalabra);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error en la escritura");
			};
			 
	};
}

	
	
	
	
	

