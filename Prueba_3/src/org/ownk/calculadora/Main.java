package org.ownk.calculadora;

import java.util.Scanner;

//import org.ownk.singleton.Validaciones;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Main {
	
	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		int operar;
		int resultado = 0;
		int continuar;
		String nombre;
		
		Scanner sc = new Scanner(System.in);
		Formulasydatos formulas= new Formulasydatos();
		
		System.out.println("Hola, cual es tu nombre?");
		nombre=sc.nextLine();
		
		Validaciones validaciones = new Validaciones(nombre);
		
		Validaciones nombreUsuario = validaciones.getSingletonInstance(nombre);
			
		System.out.println("Hola "+nombreUsuario.getNombre()+" bienvenido a la calculadora");
		
		System.out.println("Ingrese un numero");
		
		numero1 = sc.nextInt();
		formulas.setNum1(numero1);
		
		do {
		
		operar =validaciones.escogeroperacion();
		if (operar!=1 && operar!=2) {

			System.out.println("Este numero no es valido, por favor vuelva a reiniciar la calculadora");
			System.exit(0);

		}

		System.out.println("Ingrese otro numero");
		
		numero2= sc.nextInt();
		formulas.setNum2(numero2);
		
		if(operar == 1 && resultado==0) {
			
			resultado=formulas.suma();
			
		}else if (operar == 2 && resultado==0) {
			
			resultado=formulas.resta();
			
		}else if (operar ==1 && resultado!=0) {
			
			resultado=formulas.seguiroperando(operar, resultado);
			
		}else if(operar == 2 && resultado !=0) {
			
			resultado=formulas.seguiroperando(operar, resultado);
			
		}
		
		continuar=validaciones.volveraoperar(resultado);
		
		}while(continuar!=2 );
		
		System.out.println("Gracias por usar la calculadora, Adios");
	}

}