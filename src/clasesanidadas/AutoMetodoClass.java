/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesanidadas;

/**
 *
 * @author roman
 */
public class AutoMetodoClass { // class principal
    
    int velMax = 100;
    
    public void control(){ // metodo de control
        int tiempoFrenado = 3;
        
        class Acciones{ // clase del metodo de control
            public void accelerar(){ // metodo interno de la clase Acciones
                System.out.println(velMax);
            }
            public void frenar(){ // metodo interno de la clase Acciones
                System.out.println(tiempoFrenado);
            }
            public void adelantar(){ // metodo interno de la clase Acciones
                System.out.println(velMax);
            }
        }
        
        Acciones a = new Acciones(); // objeto del de la clase interna del metodo control
        a.accelerar(); // metodos internos de la clase interna del metodo control
        a.adelantar(); // metodos internos de la clase interna del metodo control
        a.frenar(); // metodos internos de la clase interna del metodo control
    }
   
   /**
    * lo mismo que arriba
    */
    public void mantenimiento(){
         int maxGasolina = 100; //litros
         
        class Revisiones{
            public void verGasolina(){
                System.out.println(maxGasolina);
            }
            public void calcularVelMedia(){
                System.out.println(velMax);
                
            }
        }
        
        Revisiones r = new Revisiones();
        r.calcularVelMedia();
        r.verGasolina();
    }
    
    public static void main(String[] args) {
        AutoMetodoClass mc = new AutoMetodoClass(); // objeto de la clase principal
        mc.control();  // metodo control de la clase principal
        mc.mantenimiento();  // metodo mantenimiento de la clase principal
    }
    
}
