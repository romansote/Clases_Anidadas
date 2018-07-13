/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesanidadas;

import sun.applet.Main;

/**
 *
 * @author roman
 */
public class ClaseExternaInternas {
    static int x =1;
    int z = 0;

    public  int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * 
     **/
    public static class ClaseInterna{
      
        
        public void metodo(){
            
            System.out.println(x);
            
            ClaseExternaInternas ext = new ClaseExternaInternas();
          
            System.out.println(ext.getX());
          
        }
        
        
    }
    
    public static void main(String[] args) {
         ClaseExternaInternas ext = new ClaseExternaInternas();
         ClaseExternaInternas.ClaseInterna inter = new ClaseExternaInternas.ClaseInterna();
         
         inter.metodo();
    }
    
    
    
}
