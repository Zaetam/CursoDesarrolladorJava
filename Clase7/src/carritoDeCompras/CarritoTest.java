package carritoDeCompras;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class CarritoTest {

	@Test
	void testCostoFinalDescuentoFijo() {
		Producto productoA=new Producto ("choclo","001",300F);
		Producto productoB=new Producto ("calabaza","010",400F);
		Producto productoC=new Producto ("pimiento","011",800F);
		
		
		Carrito carritotest= new Carrito (productoA, productoB, productoC, LocalDateTime.parse("2023-10-22T07:17"));
		Descuento desFijo= new DescuentoFijo(100);
		
		float valorFinal=carritotest.costoFinal(desFijo);
		assertEquals(valorFinal,1400);
	}
	
	@Test
	void testCostoFinalDescuentoPorcentual() {
		Producto productoA=new Producto ("choclo","001",300F);
		Producto productoB=new Producto ("calabaza","010",400F);
		Producto productoC=new Producto ("pimiento","011",800F);
		
		
		Carrito carritotest= new Carrito (productoA, productoB, productoC, LocalDateTime.parse("2023-10-22T07:17"));
		Descuento desPorcentaje= new DescuentoPorcentaje(0.50F);
		
		float valorFinal=carritotest.costoFinal(desPorcentaje);
		assertEquals(valorFinal,750);
	}
	
	@Test
	void testCostoFinalDescuentoTope() {
		Producto productoA=new Producto ("choclo","001",300F);
		Producto productoB=new Producto ("calabaza","010",400F);
		Producto productoC=new Producto ("pimiento","011",800F);
		
		
		Carrito carritotest= new Carrito (productoA, productoB, productoC, LocalDateTime.parse("2023-10-22T07:17"));
		Descuento desPorcentajeConTope= new DescuentoPorcentajeConTope(0.50F);
		desPorcentajeConTope.setValorDescuento(0.25F);
		
		
		
		float valorFinal=carritotest.costoFinal(desPorcentajeConTope);
		assertEquals(valorFinal,1125);
	}

}
