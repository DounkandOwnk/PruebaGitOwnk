package org.ownk.calculadora;

public abstract class Datos{
	
	private int num1;
	private int num2;
	private int operacion;
	private int contenedor = 0;
	
	
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
	public int getOperacion() {
		return operacion;
	}
	public void setOperacion(int operacion) {
		this.operacion = operacion;
	}
	public int getContenedor() {
		return contenedor;
	}
	public void setContenedor(int contenedor) {
		this.contenedor = contenedor;
	}
	
	
	
}
