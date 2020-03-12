package Herencia;

public class Main {

	public static void main(String[] args) {

		Clase_Hija1 ejemploHija = new Clase_Hija1();
		ejemploHija.setNombre("Antonio");
		ejemploHija.setApellido("Ramirez");
		ejemploHija.setEdad(40);
		ejemploHija.setNombrehija("Maria");
		
		

		System.out.println("El papá de "+ejemploHija.getNombrehija()+" se llama "+ejemploHija.getNombre());
		System.out.println("El papá de "+ejemploHija.getNombrehija()+" se apellida "+ejemploHija.getApellido());
		System.out.println("El papá de "+ejemploHija.getNombrehija()+" tiene "+ejemploHija.getEdad());
		System.out.println("La hija de "+ejemploHija.getNombre()+" se llama "+ejemploHija.getNombrehija());
	}

}
