package carritoDeCompras;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje{
	//atributos
	private float tope;

	
	//constructor
	public DescuentoPorcentajeConTope(float tope) {
		super(0);
		this.tope=tope;
		
	}
	
	//getter y setter
	public float getTope() {
		return this.tope;
	}
	
	public void setTope(float nuevoValor) {
		this.tope=nuevoValor;
	}
	

	@Override
	public void setValorDescuento(float valorDescuento) {
		if(valorDescuento>this.tope) {
			super.setValorDescuento(0);
			System.out.println("no se puede calcular descuento porque superó el tope");
		}
		else {
			super.setValorDescuento(valorDescuento);
		}
	}
}
