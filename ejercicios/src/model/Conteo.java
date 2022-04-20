package model;

import dto.Ascendente;
import dto.Descendente;

public class Conteo {

	public static void main(String []args) throws Exception {
		 System.out.println("Ascendente: ");
		 Thread ascendente = new Ascendente();
		 ascendente.start();
		 Thread.sleep(1000);
		 System.out.println("----------------");
		 System.out.println("Descendente: ");
		 Thread descendente = new Descendente();
		  descendente.start();
		  }

}
