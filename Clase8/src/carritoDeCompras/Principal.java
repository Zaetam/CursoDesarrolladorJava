package carritoDeCompras;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) throws ExceptionPrice, ExceptionDiscount {
		
		String archivo="Archivo Productos.txt";
		
		
		try {
			List<Producto> listita=new ArrayList<Producto>();
			List<String> lista=Files.readAllLines(Paths.get(archivo));
			for (String linea:lista) {
				String[] datos= linea.split(" ");	// lo separa así [40, jabón, 123f]
			
			
			Producto producto=new Producto (datos[1],datos[2],Float.parseFloat(datos[0]));
				
			listita.add(producto);
			
			};
			
			Carrito carrito= new Carrito (listita,LocalDateTime.parse("2023-10-18T06:27"));
			Persona persona1= new Persona ("Alejandro", "Sosa",	LocalDateTime.parse("1986-06-06T06:45"), carrito); 
			Carrito miCarrito=persona1.getCarrito();
			
			Descuento desFijo=new DescuentoFijo(900);
			Descuento desPorcentaje= new DescuentoPorcentaje (0.50F);
			Descuento desPorcentajeConTope= new DescuentoPorcentajeConTope(0.30F);
			desPorcentajeConTope.setValorDescuento(0.80F);
			
			try {
			float resultado=miCarrito.costoFinal(desFijo);
			
			
			System.out.println("El costo final es: "+resultado);
			}
			
			catch(ExceptionDiscount e) {
				System.out.println("El descuento da un valor negativo");
				
			}catch (ExceptionPrice e){
				System.out.println("el costo de al menos uno de los productos es cero");
			}
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
			
		}
	
		
	 
	}
}
	