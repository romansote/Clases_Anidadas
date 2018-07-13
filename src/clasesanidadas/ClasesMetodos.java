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
public class ClasesMetodos { // clase externa
   static int x = 1;
    public void metodoExterno(){ // metodo externo
        int y = 2;
        class ClaseInterna{ // clase interna(dentro del metodo externo
            
            int z = 3;
            public void metodoInterno(){ // metodo interno dentro de la clase interna
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }
        }
        
        ClaseInterna ci = new ClaseInterna(); // objeto de clase interna
        ci.metodoInterno(); // invocacion del metodo de la clase interna
    }
    
    public static void main(String[] args) {
        ClasesMetodos classM = new ClasesMetodos(); // objeto de la clase externa
        classM.metodoExterno(); // invocacion del metodo externo(el que contiene la clase Interna
        
    }
    
}
