package com.vobi.demo.stream.mat;

@FunctionalInterface
interface Matematicas {
	 
	public double operacion(double x, double y);
 
}

public class MatematicaFuntional {

	public static void main(String[] args) {
		Matematicas sumar=(x, y) -> x+y;
		Matematicas restar=(x, y) -> x-y;
		
		System.out.println(sumar.operacion(33.4,4.5));
		System.out.println(restar.operacion(33.4,4.5));
	}
	
}




