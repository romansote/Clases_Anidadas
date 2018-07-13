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
public class ClasesMiembro {
    int x = 5;

    public ClasesMiembro() {
        ClasesMiembro.claseInterna inter = new claseInterna();
        inter.metodo();;
    }
    
    
    public class claseInterna{
        public void metodo(){
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) {
        ClasesMiembro claseMiembro = new ClasesMiembro();

    }
}
