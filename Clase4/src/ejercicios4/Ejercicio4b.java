package ejercicios4;

import java.util.Scanner;

public class Ejercicio4b {
public static void main(String[] args) {
	
	Scanner lectura= new Scanner (System.in);
	
	System.out.println("Ingrese un primer número");
	int numero1=Integer.parseInt(lectura.nextLine());
	
	System.out.println("Ingrese un segundo número");
	int numero2=Integer.parseInt(lectura.nextLine());
	
	System.out.println("Ingrese un tercer número");
	int numero3=Integer.parseInt(lectura.nextLine());
	
	System.out.println("Ingrese la letra A para orden ascendente, o la letra D para orden inverso");
	String letra1=lectura.nextLine();
	
	
		int menor;
		int mayor;
		int medio;
		int vector[]=new int[3];
		
			
		if (numero1<numero2) {
			menor=numero1;
			mayor=numero2;
		
		}else {
			menor=numero2;
			mayor=numero1;
		};
			
		
		if(numero3<=menor) {
			medio=menor;
			menor=numero3;
		}else {
			if(numero3>mayor) {
				medio=mayor;
				mayor=numero3;
			}else {
				medio=numero3;
			};
	
		};
		
		if(letra1.equals("A")){
			
			vector[0]=menor;
			vector[1]=medio;
			vector[2]=mayor;
		
		}else {
			if(letra1.equals("D")) {
			vector[0]=mayor;
			vector[1]=medio;
			vector[2]=menor;
		};
		};
		
		System.out.println(vector[0]);
		System.out.println(vector[1]);
		System.out.println(vector[2]);
		
};
}
