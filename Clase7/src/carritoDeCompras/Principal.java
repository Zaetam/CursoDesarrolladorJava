package carritoDeCompras;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		String archivo="Archivo Productos.txt";
		
		
		try {
			List<String> lista=Files.readAllLines(Paths.get(archivo));
			String linea1=lista.get(1); //tengo una cadena por línea
			String[] datosProducto1=linea1.split(" ");// lo separa así [40, jabón, 123f]
			String[] datosProducto2=lista.get(2).split(" ");
			String[] datosProducto3=lista.get(3).split(" ");
			
			Producto producto1=new Producto (datosProducto1[1],datosProducto1[2],Float.parseFloat(datosProducto1[0]));
			Producto producto2=new Producto (datosProducto2[1],datosProducto2[2],Float.parseFloat(datosProducto2[0]));
			Producto producto3=new Producto (datosProducto3[1],datosProducto3[2],Float.parseFloat(datosProducto3[0]));
			
			
			Carrito carrito= new Carrito (producto1, producto2, producto3,LocalDateTime.parse("2023-10-18T06:27"));
			Persona persona1= new Persona ("Alejandro", "Sosa",	LocalDateTime.parse("1986-06-06T06:45"), carrito); 
			Carrito miCarrito=persona1.getCarrito();
			
			Descuento desFijo=new DescuentoFijo(30);
			Descuento desPorcentaje= new DescuentoPorcentaje (0.50F);
			Descuento desPorcentajeConTope= new DescuentoPorcentajeConTope(0.30F);
			desPorcentajeConTope.setValorDescuento(0.80F);
			
			
			float resultado=miCarrito.costoFinal(desPorcentajeConTope);
			
			
			System.out.println("El costo final es: "+resultado);
		
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	
		
	 
	}
}
	