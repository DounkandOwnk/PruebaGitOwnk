package org.ownk.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		IVehiculo carro  = new Carro();
		IVehiculo camioneta = new Camioneta();
		
		carro.arrancar();
		camioneta.arrancar();
		

	}

}
