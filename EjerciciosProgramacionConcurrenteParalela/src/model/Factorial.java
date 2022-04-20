package model;
import java.util.Scanner;

public class Factorial extends Thread {
	int n,r = 1,i;
    

    public Factorial(int numero, int resultado) {
    	Scanner sc = new Scanner(System.in);
        
    	System.out.println("Ingrese Un Numero: ");
    	n = sc.nextInt();
    }
    @Override
    public void run() {
    	for (i=n;i>=1;i--){
    	r=r*i;
    	}
    	System.out.println("El factorial de tu numero es: "+ r);
    }

    public static void main (String[]args ) {
    	try {
			Thread emp1 = new Factorial(0,0);
			emp1.start();
			Thread.sleep(2000);
			Thread emp2 = new Factorial(0,0);
			emp2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}