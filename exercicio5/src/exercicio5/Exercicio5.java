/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author BD
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] valores = {5, 2, 7};
        int produto = 1;

        for (int i = 0; i < valores.length; i++) {
            produto *= valores[i];
        }

        System.out.println("Resultado = " + produto);
    }

}
