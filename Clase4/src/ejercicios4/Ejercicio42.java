package ejercicios4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class Ejercicio42 {
	public static void main(String[] args) {
		
		int acumulador=0;
		
		String archivo=args[0]	;
		String operacion=args[1];
		System.out.println(archivo);
		System.out.println(operacion);
		try {
				
			for(String linea:Files.readAllLines(Paths.get(archivo))){
				if(operacion.equals("suma")) {
					acumulador=acumulador+Integer.parseInt(linea);
					} else {
						if(operacion.equals("multiplicacion")){
							acumulador=acumulador*Integer.parseInt(linea);
							};
				};
					
			};
	
			
			} catch(IOException e) {
				e.printStackTrace();
			};
			
			System.out.println(acumulador);

};
}
