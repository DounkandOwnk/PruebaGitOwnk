package org.ownk.abstrac;

public class Director extends Profesor {

	private String nombreDirector;
	private String nombrePadre;
	private String nombreHijo;
	
	public String getNombreDirector() {
		return nombreDirector;
	}
	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}
	public String getNombrePadre() {
		return nombrePadre;
	}
	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}
	public String getNombreHijo() {
		return nombreHijo;
	}
	public void setNombreHijo(String nombreHijo) {
		this.nombreHijo = nombreHijo;
	}
	
}