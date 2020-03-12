package org.ownk.calculadora.reload;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
	
	public static final int OPERACION_SUMA=1;
	public static final int OPERACION_RESTA=2;
	
	private double numero1;
	private double numero2;
	private double resultado;
	
	List<IOperacionBasica> listaOperaciones;
	
	
	private static Calculadora calculadora;
	
	
	private Calculadora() {
		

		listaOperaciones = new ArrayList<IOperacionBasica>();
		listaOperaciones.add(new OperacionSuma());
		listaOperaciones.add(new OperacionResta());
		listaOperaciones.add(new OperacionMultiplicar());
		listaOperaciones.add(new OperacionDividir());
	} ;
	
	public static Calculadora getCalculadora() {
		
		if(calculadora == null) {
			calculadora=new Calculadora();
		}
		
		return calculadora;
		
	}
	
	public double ejecutaroperacion(int idOperacion,double numero1, double numero2) throws Exception{
		
		
		for (IOperacionBasica iOperacionBasica : listaOperaciones) {
			if(iOperacionBasica.soyoperacion(idOperacion)) {
				resultado=iOperacionBasica.ejecutaroperacion(numero1, numero2);
			}
		}
		
		return resultado;
	}
	
	
	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}


}
