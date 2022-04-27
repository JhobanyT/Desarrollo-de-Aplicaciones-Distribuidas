package model;

import dto.Almacen;
import dto.Cliente;
import dto.Puerta;

public class Principal {
        public static void main(String[] args) throws InterruptedException {
                final int NUM_CLIENTES  = 301;
                final int NUM_PRODUCTOS = 100;

                Cliente[]   cliente =   new Cliente[NUM_CLIENTES];
                Almacen     almacen =   new Almacen(NUM_PRODUCTOS);
                Puerta      puerta  =   new Puerta();

                Thread[]    hilosAsociados=new Thread[NUM_CLIENTES];

                for (int i=1; i<NUM_CLIENTES; i++){
                        String nombreHilo   = "Cliente "+i;
                        cliente[i]          = new Cliente(puerta, almacen,nombreHilo);
                        hilosAsociados[i]   = new Thread(cliente[i]);
                        hilosAsociados[i].start();
                } 
                for (int i=1; i<NUM_CLIENTES; i++){
                        hilosAsociados[i].join();
                }
        }
}