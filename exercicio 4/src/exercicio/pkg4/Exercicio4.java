/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author BD
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO Auto-generated method stub
        String opcao;
        int pess = 0, camisas = 0;
        double bilhetes = 0;
        do {
            do {
                System.out.println("O sócio tem camisa?\n");
                System.out.println("c -> com comisa \n n -> sem camisa \n s -> sair do programa");
                opcao = new Scanner(System.in).next();
            } while (!opcao.equals("c") && !opcao.equals("C") && !opcao.equals("s") && !opcao.equals("S") && !opcao.equals("n") && !opcao.equals("N"));

            switch (opcao) {

                case "c":
                case "C":
                    camisas++;
                    pess++;
                    break;

                case "n":
                case "N":
                    bilhetes++;
                    pess++;
                    break;
            }

        } while (!opcao.equals("s") && !opcao.equals("s"));

        camisas *= 14;
        bilhetes *= 7.5;

        System.out.println("\n" + pess + " pessoas comprararam ingressos");
        System.out.println("Foi angariado " + camisas + " € com camisas");
        System.out.println("Foi angariado " + bilhetes + " € com bilhetes");
    }

}
