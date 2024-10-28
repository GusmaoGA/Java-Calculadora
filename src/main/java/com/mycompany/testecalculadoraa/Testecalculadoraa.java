/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testecalculadoraa;

/**
 *
 * @author Gusmão
 */

import java.util.Scanner;
public class Testecalculadoraa {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        char operador;

        do {                           
           
            System.out.println("Digite o valor um: ");
            int num1 = entrada.nextInt();

            System.out.println("Digite o valor dois: ");
            int num2 = entrada.nextInt();

            System.out.println("Escolha a operação desejada: +, -, /, * OU SAIR: '.'");
            operador = entrada.next().charAt(0);
            
            calc.setnum1(num1);   
            calc.setnum2(num2);        

            if (operador == '+') {
                System.out.println("Resultado da soma: " + calc.some());
            } else if (operador == '-') {
                System.out.println("Resultado da subtração: " + calc.subtraia());
            } else if (operador == '*') {
                System.out.println("Resultado da multiplicação: " + calc.multiplique());
            } else if (operador == '/') {
                System.out.println("Resultado da divisão: " + calc.divisão());
            } else if (operador == '.') {
                System.out.println("Saindo da calculadora...");
            } else {
                System.out.println("Operador inválido. Por favor, escolha +, -, * ou /.");
            }

        } while (operador != '.'); 

        entrada.close();
    }
}

