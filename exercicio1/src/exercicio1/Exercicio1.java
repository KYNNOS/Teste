/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

public Exercicio1() {
// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
// TODO Auto-generated method stub
String insert;
char[] inserir= new char[5];
int cont=0;
System.out.println("Insira 5 caracteres");
insert = new Scanner(System.in).nextLine();
inserir=insert.toCharArray();

for(int i=0;i<insert.length();i++){
numero(inserir[i]);
if(numero(inserir[i])==true){
cont++;
}

}
System.out.println("Existem "+cont+" caracteres correspondentes entre 0 e 9");
}

static boolean numero(char num){

switch(num){
case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9': return true;
default: return false;
}

}

}
