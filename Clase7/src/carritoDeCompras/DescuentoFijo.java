package carritoDeCompras;

public class DescuentoFijo extends Descuento{
	
	//atributo heredado
	
	//constructor

	public DescuentoFijo(float valorDescuento) {
		super(valorDescuento);
	}
	
	//método obligatorio

	@Override
	public float valorFinal(float valorInicial) {
		return valorInicial-super.getValorDescuento();
	}

}
