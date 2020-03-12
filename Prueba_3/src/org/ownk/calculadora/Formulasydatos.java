package org.ownk.calculadora;

public class Formulasydatos implements IOperacion {

	protected int num1;
	protected int num2;
	protected int contenedor;
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getContenedor() {
		return contenedor;
	}
	public void setContenedor(int contenedor) {
		this.contenedor = contenedor;
	}
	
	@Override
	public int suma() {
	
		contenedor= this.num1+this.num2;
		
		return contenedor;
		
	}

	@Override
	public int resta() {
		
		contenedor= this.num1-this.num2;
		
		return contenedor;
		
	}
	
	public int seguiroperando(int operar, int resultadoactual) {
		
		if(operar==1 && resultadoactual!=0) {
			
			resultadoactual=resultadoactual+this.num2;
			
		}else if(operar==2 && resultadoactual!=0) {
			
			resultadoactual=resultadoactual-this.num2;
			
		}
		
		return resultadoactual;
		
	}

}
