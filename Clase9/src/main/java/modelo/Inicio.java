package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
	public static void main(String[] args) {
		System.out.println();
		Scanner scanner=new Scanner (System.in);
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		//loop para agregar personas
		while(true) {
			System.out.println("Ingrese el nombre");
			String nombre=scanner.nextLine();
			
			System.out.println("Ingrese el apellido");
			String apellido=scanner.nextLine();
			
			System.out.println("Ingrese la fecha de nacimiento");
			String fechaNacimiento=scanner.nextLine();
			
			Persona persona=new Persona();
			persona.setNombre(nombre);
			persona.setApellido(apellido);
			persona.setFechaNacimiento(fechaNacimiento);
			
			personas.add(persona);
			
			System.out.println("Desea agregar otra persona? s/n");
			String respuesta=scanner.nextLine();
			
			if (respuesta.equals("n")){
				break;
			}
		}
		
		for(Persona persona:personas) {
			System.out.println("nombre: "+persona.getNombre());
			System.out.println("apellido: "+persona.getApellido());
			System.out.println("fecha de nacimiento:" + persona.getFechaNacimiento());
			System.out.println("------------------");
		}
		
	}

}
