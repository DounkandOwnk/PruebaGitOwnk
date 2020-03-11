package Clase_Abstracta;

public abstract class Profesor {

	private String nombre;
	private int cc;
	private String materiaDictada;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getMateriaDictada() {
		return materiaDictada;
	}
	public void setMateriaDictada(String materiaDictada) {
		this.materiaDictada = materiaDictada;
	}
	
}
