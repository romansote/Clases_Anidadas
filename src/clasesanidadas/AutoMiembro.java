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
public class AutoMiembro {
    
    int tiempoFrenado = 3;
    int velocidadMaxima = 100;

    public AutoMiembro() {
        AutoMiembro.Accelerar accelerar = new Accelerar();
        AutoMiembro.Frenar frenar = new Frenar();
        frenar.frenar();
        accelerar.accelear();
    }
    
    
     
    public class Frenar{
        
        public void frenar(){
            System.out.println(tiempoFrenado);
            
        }    
    }
    
    public class Accelerar{
        public void accelear(){
            System.err.println(velocidadMaxima);
        }
    }
    
    public static void main(String[] args) {
        
        AutoMiembro auto = new AutoMiembro();
        
    }
    
}
