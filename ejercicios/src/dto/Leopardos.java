package dto;

public class Leopardos extends Thread{
	private int distancia;
	private String nombre;
	
	public Leopardos(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void run() {
		for(int i = 0; i<=10; i++) {
			/*if(i==0) {
				System.out.println("\n +++ Empezo el " + nombre + " +++");
			}*/
			if(i>=1) {
				System.out.println(nombre + " recorrio "+ i + " km");
			}
			
			if(i==10) {
				System.out.println("\n ´´´ Termino el " + nombre + " '''\n");
			}
		}
	}
}