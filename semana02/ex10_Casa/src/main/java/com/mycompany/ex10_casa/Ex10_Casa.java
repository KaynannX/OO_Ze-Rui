/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex10_casa;

import classes.Casa;

/**
 *
 * @author dk
 */
public class Ex10_Casa {

    public static void main(String[] args) {
      Casa c1 = new Casa();
      Casa c2 = new Casa();
      Casa c3 = new Casa();
      
      c1.preencher();
      c2.preencher();
      c3.preencher();
      
        System.out.println("lista das casas");
        System.out.println("~~~~casa 1~~~~~~");
        c1.imprimir();
        System.out.println("~~~~casa 2~~~~~~");
        c2.imprimir();
        System.out.println("~~~~casa 3~~~~~~");
        c3.imprimir();
        
      if(c1.calcularPrecoPorM2()<c2.calcularPrecoPorM2() && c1.calcularPrecoPorM2()<c3.calcularPrecoPorM2()){
          System.out.println("Casa 1 tem o menos preco");
      } else if(c2.calcularPrecoPorM2()<c1.calcularPrecoPorM2() && c2.calcularPrecoPorM2()<c3.calcularPrecoPorM2()){
          System.out.println("Casa 2 tem o menos preco");
      } else if(c3.calcularPrecoPorM2()<c1.calcularPrecoPorM2() && c3.calcularPrecoPorM2()<c2.calcularPrecoPorM2()){
          System.out.println("Casa 3 tem o menos preco");
      } else{
          System.out.println("A 2 ou mais casa com o mesmo preco baixo");
      }
    }
}
