package carritoDeCompras;

import java.time.Duration;
import java.time.LocalDateTime;

public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDateTime fechaDeNacimiento;
	private Carrito carrito;
	
	
	public Persona (String nombre, String apellido,	LocalDateTime fechaDeNacimiento) {
		this.nombre= nombre;
		this.apellido=apellido;
		this.fechaDeNacimiento=fechaDeNacimiento;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	
	
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	
	public LocalDateTime getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDateTime fechaDeNacimineto) {
		this.fechaDeNacimiento=fechaDeNacimiento;
	}
	
	
	public Carrito getCarrito() {
		return carrito;
	}
		
	public void setCarrito(Carrito carrito) {
		this.carrito=carrito;
	}

	//otros métodos
	
	public int edad (){
		LocalDateTime fechaHoy= LocalDateTime.now();
		long dias= Duration.between(this.fechaDeNacimiento, fechaHoy).toDays();
		int edad=(int) (dias/365.2425);
		return edad;
		
	};
}
