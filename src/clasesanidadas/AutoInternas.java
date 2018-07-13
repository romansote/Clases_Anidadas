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
/**
 * Clases internas estaticasx
 **/
public class AutoInternas {
    
   static int  velocidadMax = 100;
   static int  tiempoFrenado = 3;
   
    public static class Freno{
        
        public void frenar(){
            System.out.println(tiempoFrenado); 
        }

    }
    
    public static class Adelantar{
        
        public void adelantar(){
            System.out.println(velocidadMax);
        }
    
    }
    
    public static void main(String[] args) {
        /**
         * objetos
         */
        AutoInternas auto = new AutoInternas();
        AutoInternas.Freno freno = new AutoInternas.Freno();
        AutoInternas.Adelantar adelantar = new  AutoInternas.Adelantar();    
        
        /**
         * Metodos 
         */
        freno.frenar();
        adelantar.adelantar();
        
        
        
    }
    
}
