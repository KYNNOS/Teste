/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author BD
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num,num1,num2,num3,media,soma;
       
        System.out.println("insira 4 numeros \n");
         num = new Scanner(System.in).nextInt();
         num1 = new Scanner(System.in).nextInt();
         num2 = new Scanner(System.in).nextInt();
         num3 = new Scanner(System.in).nextInt();
         soma=num+num1+num2+num3;
        media=soma/4;
         System.out.println("media de golos = "+media);
    }
    
}
