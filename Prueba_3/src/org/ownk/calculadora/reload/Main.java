package org.ownk.calculadora.reload;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora =Calculadora.getCalculadora();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero primer numero");
		calculadora.setNumero1( sc.nextDouble());
		
		System.out.println("Ingrese un numero segundo numero");
		calculadora.setNumero2( sc.nextDouble());
		
		System.out.println("Por favor ingrese el proceso que quiere realizar");
		System.out.println("Suma (1)");
		System.out.println("Resta (2)");
		System.out.println("Multiplicar (3)");
		System.out.println("Dividir (4)");
		
		int idOperacion=sc.nextInt();
		
		try {
			double resultado=calculadora.ejecutaroperacion(idOperacion, calculadora.getNumero1(), calculadora.getNumero2());
			System.out.println("el resultado es "+resultado);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
