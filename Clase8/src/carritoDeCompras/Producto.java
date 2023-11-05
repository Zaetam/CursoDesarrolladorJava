package carritoDeCompras;

public class Producto {
			
		//atributos
		private String nombre;
		private String codigo;
		private float precio;
		
		//constructor
		public Producto (String nombre, String codigo, float precio) {
			this.nombre=nombre;
			this.codigo=codigo;
			this.precio=precio;
		}
		//getters y setters
		public String getNombre() {
			return this.nombre;
		}
		public void setNombre(String nombre) {
			this.nombre=nombre;
		}
		
		
		
		public String getCodigo() {
			return this.codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo=codigo;
		}
		
		
		public void setPrecio(float precio) {
			this.precio=precio;
		}
		
		
		//otros métodos
		
		public float costoFinal() {
			return this.precio;
		}
		

	}


