/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BD
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inst = null;
        char[] ins= new char[1];

        Random r = new Random();
        int num1 = r.nextInt(10) + 0;
        int num = r.nextInt(10) + 0;
        int ganhou = 0;
        boolean perdeu = false;
        //char ins = 0;
        switch (ins[0]){
            case 'c':case 'b':
        
        
        }

        System.out.println("pensei em 2 numeros um deles é o " + num + "e o outro é mais alto ou mais baixo para responder maior insira c e para menor b");
        if (num == num1) {
             num1 = r.nextInt(10) + 0;

        } else {
           
            
            inst = new Scanner(System.in).nextLine();
            ins=inst.toCharArray();
            while (perdeu == false) {
                if (num1 < num) {
                    if (ins[0] == 'b') {
                        System.out.println("parabens acertou o valor em que pensei foi " + num1 + " o proximo valor é mais alto ou mais baixo para responder maior insira c e para menor b");
                        num1 = r.nextInt(10) + 0;
                        ganhou++;
                        inst = new Scanner(System.in).nextLine();
                        ins=inst.toCharArray();
                    } else if (ins[0] == 'c') {
                        System.out.println("que pena o valor que pensei foi " + num1 + " fez um total de " + ganhou + " pontos");
                        perdeu = true;
                    }

                } else {
                    if (ins[0] == 'c') {
                        System.out.println("parabens acertou o valor em que pensei foi " + num1 + " o proximo valor é mais alto ou mais baixo para responder maior insira c e para menor b");
                        num1 = r.nextInt(10) + 0;
                        ganhou++;
                        inst = new Scanner(System.in).nextLine();
                        ins=inst.toCharArray();
                    } else if (ins[0] == 'b') {
                        System.out.println("que pena o valor que pensei foi " + num1 + " fez um total de " + ganhou + " pontos");
                        perdeu = true;
                    }

                }

            }
        }

    }

}









