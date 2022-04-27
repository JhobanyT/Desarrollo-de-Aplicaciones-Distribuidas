package dto;

import java.util.Random;

public class Utilidades {
    public static int numAzar(int numAzar){
        Random generador = new Random();
        return generador.nextInt(numAzar);
    }

    public static void esperarTiempoAzar(int esperarTiempoAzar){
        try {
            Random generador = new Random();
            Thread.sleep(generador.nextInt(esperarTiempoAzar));
        }catch (InterruptedException ex){
            System.out.println("Falló la espera");
        }
    }
}