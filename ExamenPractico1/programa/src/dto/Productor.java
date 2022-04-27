package dto;
public class Productor implements Runnable{

        Cola colaCompartida;
        public Productor(Cola cola){
                this.colaCompartida=cola;
        }
        public void run() {
           while (true){
                   int num=Utilidades.numAzar(10);
                   while (colaCompartida.encolar(num)==false){
                           Utilidades.esperarTiempoAzar(3000);
                   }

                   System.out.println("Productor encoló el numero:"+num);
           }
        }
}