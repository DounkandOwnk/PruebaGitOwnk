package org.ownk.calculadora.reload;

public class OperacionDividir implements IOperacionBasica{

	@Override
	public double ejecutaroperacion(double numero1, double numero2) {
		
		double resultado = numero1*numero2;
		return resultado;
	}

	@Override
	public boolean soyoperacion(int idOperacion) {
		if(idOperacion==3) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
