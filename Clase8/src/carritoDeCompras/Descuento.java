package carritoDeCompras;

public abstract class Descuento {
	//atributo
	private float valorDescuento;
	
	//constructor
	public Descuento(float valorDescuento) {
		this.valorDescuento=valorDescuento;
	}
	


	//getter y setter
	public float getValorDescuento() {
		return this.valorDescuento;
	}
	
	public void setValorDescuento(float valor) {
		this.valorDescuento=valor;
	}
	//otro metodo recibe valor inicial y determina valor final
	public abstract float valorFinal (float valorInicial) throws ExceptionDiscount ;
}
