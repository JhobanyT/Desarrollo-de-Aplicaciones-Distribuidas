package dto;

public class Numeros extends Thread{

	@Override
	public void run() {
		int n;
		double r=0;
		
		for(n=1; n<=10; n++) {
			
			System.out.println("El cubo de " + n +" es: " + Math.pow(n, 3));
			 r += Math.pow(n, 3);
		}
		System.out.println("\n" + "La suma de los cubos es: " + r);
	}
}
