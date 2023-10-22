package carritoDeCompras;

public class DescuentoPorcentaje extends Descuento {
			
		//atributo heredado
		
		//constructor

		public DescuentoPorcentaje(float valorDescuento) {
			super(valorDescuento);
		}
		
		//método obligatorio

		@Override
		public float valorFinal(float valorInicial) {
			return valorInicial*(1-super.getValorDescuento());
		}

}
