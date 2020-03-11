package Clase_Abstracta;

public class Main {

	public static void main(String[] args) {
	
		Director informacion = new Director();
		InformacionNotas informacionNotas = new InformacionNotas();
		
		informacion.setCc(101559568);
		informacion.setMateriaDictada("Matematicas");
		informacion.setNombre("Ramiro Casimiro");
		informacion.setNombreDirector("Antonio Rodriguez");
		informacion.setNombreHijo("Juan Rogriguez");
		informacion.setNombrePadre("Camilo Cifuebtes");
		
		informacionNotas.setNota(3.5);
		informacionNotas.setPasoAño("Aprobo");
		
		System.out.println("El director "+informacion.getNombreDirector()+" informa al padre "+informacion.getNombrePadre()+" que su hijo "+informacion.getNombreHijo()+" el cual tuvo clases con el profesor "+informacion.getNombre()+" identificado con la cedula de ciudadnia "+informacion.getCc()+" el cual informa al padre que su hijo "+informacionNotas.getPasoAño()+" el año escolar con una nota de "+informacionNotas.getNota());

	}

}
