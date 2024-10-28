/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecalculadoraa;

/**
 *
 * @author Gusmão
 */
// CONSTRUTOR
public class Calculadora {
    private int num1;
    private int num2;
    char operacao;
           
    //GET E SET
    public int getnum1() {
        return num1;
    }

    public void setnum1(int num1) {
        this.num1 = num1;
    }

    public int getnum2() {
        return num2;
    }

    public void setnum2(int num2) {
        this.num2 = num2;
    }
    // SOMA
     public int some() {
        return num1 + num2;
    }

    // SUBTRAÇÃO
    public int subtraia() {
        operacao = '-';
        return num1 - num2;
    }

    // MULTIPLICAÇÃO
    public int multiplique() {
        operacao = '*';
        return num1 * num2;
    }
    // DIVISÃO
    public int divisão() {
        operacao = '/';
      if (num2 == 0) {
            System.out.println("Erro: Divisão por zero.");
            return 0; 
        } else{
        return num1 / num2;
      }
}
    
}
