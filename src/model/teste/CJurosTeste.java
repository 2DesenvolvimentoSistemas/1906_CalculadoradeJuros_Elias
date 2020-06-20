/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.CJuros;

/**
 *
 * @author Elias
 */
public class CJurosTeste {
    public static void main(String[] args) {
        //instância
        CJuros teste = new CJuros();
        
        System.out.printf("%.2f x %.2f x %.2f / 100 = %.2f", 1000.0, 10.0, 3.0, teste.CalcularJuros(1000, 10, 3));
    }
}
