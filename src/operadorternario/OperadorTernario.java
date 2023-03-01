/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author eduar
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Método Se, então. Senão, FimSe.
        int n1, n2;
        n1 = 4;
        n2 = 8;
        int r = (n1>n2)?0:1;
        System.out.println(r);
        
        int n3, n4;
        n3 = 5;
        n4 = 3;
        int r2 = (n3>n4)?n3:n4;
        System.out.println(r2);
        
        int n5, n6;
        n5 = 5;
        n6 = 3;
        int r3 = (n1>n2)?n5+3:n6*2;
        System.out.println(r3);
        
    }
    
}
