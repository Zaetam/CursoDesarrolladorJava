package carritoDeCompras;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import carritoDeCompras.Producto;

public class Carrito {
	
	//atributos
		private List<Producto> listaCarrito;
		
		private LocalDateTime fechaCompra;
		
		//constructor
		public Carrito (List<Producto> listaCarrito, LocalDateTime fechaCompra) {
			this.listaCarrito=new ArrayList<>(listaCarrito);
			this.fechaCompra= fechaCompra;
		}
		//getters y setters
		public float getValorCarrito() {
			float total=0;
			for (Producto p : listaCarrito) { 
					total= total + p.costoFinal();
			};
			return total;
		}
		
	
		public LocalDateTime getFechaCompra() {
			return this.fechaCompra;
		}
		public void setFechaCompra(LocalDateTime fechaCompra) {
			this.fechaCompra= fechaCompra;
		}
		
		
		//otro métodos
		public float costoFinal(Descuento desc) throws ExceptionPrice, ExceptionDiscount {
			float total;
						total = desc.valorFinal(this.getValorCarrito());
			
						if (total==0) {
				throw new ExceptionPrice("El valor del carrito es cero"+total);
			};
						if(total<0) {
				throw new ExceptionDiscount("El valor Inicial es menor al valor con Descuento");
		};
			return total;
		}
		

}
