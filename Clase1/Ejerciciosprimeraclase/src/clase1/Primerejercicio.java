package clase1;

public class Primerejercicio {
	public static void main(String[] args) {
		int numeroInicio=5;
		int numeroFin=14;
		int i=0;
		
		//ejercicio a
		while (numeroInicio+i<=numeroFin) {
			System.out.println(numeroInicio+i);
			i=i+1;
		};

		//ejercicio b
		i=1;
		while (numeroInicio+i<=numeroFin) {
			System.out.println(numeroInicio+i);
			i=i+2;
		};
	
		//ejercicio c
		String extra="par";
	
		if(extra=="par") {
			i=1;}
			else {
				i=0;
			};
		
	
		while (numeroInicio+i<=numeroFin) {	
			System.out.println(numeroInicio+i);
			i=i+2;
		};
	
		//ejercicio d
		for(i=0;numeroInicio+i<=numeroFin;i=i+2) {
			System.out.println(numeroFin-i);
		};
	

	
	//ejercicio categoría
	
		boolean ingresos=false;
		boolean vehiculos=false;
		boolean inmuebles=false;
		boolean propietario=true;
		
		int numeros[]=new int[4];
		int longitud=numeros.length;
		
		for (i=0;i<longitud;i++) {
			System.out.println(numeros[i]);
		}
	
		if (ingresos) {
			System.out.println("INGESOS ALTOS");
		}else {
			if(vehiculos) {
				System.out.println("INGESOS ALTOS");
			} else {
				if(inmuebles) {
					System.out.println("INGESOS ALTOS");
				}else {
					if(propietario) {
						System.out.println("INGESOS ALTOS");
					}else {
						System.out.println("OTROS");
				};
			 };
		};
	};
	
	};
}
				


		