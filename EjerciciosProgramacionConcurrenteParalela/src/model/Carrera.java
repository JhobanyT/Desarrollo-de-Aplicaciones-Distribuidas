package model;

import dto.Leopardos;

public class Carrera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Comenzo la carrera: \n");
		Leopardos l1 = new Leopardos("Leopardo africano");
		Leopardos l2 = new Leopardos("Leopardo del Amur");
		Leopardos l3 = new Leopardos("Leopardo de Berbería");
		Leopardos l4 = new Leopardos("Leopardo de Anatolia");

		l1.start();
		l2.start();
		l3.start();
		l4.start();
	}

}
