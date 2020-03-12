package org.ownk.calculadora;

import java.util.Scanner;

//import org.ownk.singleton.SoyUnico;

public class Validaciones extends Formulasydatos {

	protected int operacion;
	private int continuar;
	private String nombre;
	private static Validaciones nombreusuario;
	Scanner sc = new Scanner(System.in);
	
	public Validaciones(String nombre) {
		this.nombre=nombre;
	}

	public int volveraoperar(int contenedor) {

		System.out.println("El resultado de la operación es "+contenedor);

		System.out.println("Desea seguir haciendo operaciones ?");

		System.out.println("Si (1)");
		System.out.println("Apagar calculadora (2)");

		continuar= sc.nextInt();

		if (continuar==1) {

			continuar =1;

		}else if(continuar==2){

			continuar=2;

		}else {
			System.out.println("El dijito enviado no es valido por favor reiniciar la calculadora");
			System.exit(0);
		}

		return continuar;

	}

	public int escogeroperacion() {
		
		System.out.println("Por favor ingrese el proceso que quiere realizar");
		System.out.println("Suma (1)");
		System.out.println("Resta (2)");
		
		operacion = sc.nextInt();
		
		return operacion;

	}
	
	public static Validaciones getSingletonInstance(String nombre) {
        if (nombreusuario == null){
            nombreusuario = new Validaciones(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }
        
        return nombreusuario;
    }
	
	public String getNombre() {
		return nombre;
	}
	
	
}