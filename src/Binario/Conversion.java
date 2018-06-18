/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binario;

import FactoryBinario.Binario;

/**
 *
 * @author LN710Q
 */
public class Conversion implements Binario{
    
    String resultado;

    @Override
    public String aBinario(int a) {
        String b = ""; // binary representation as a string
        while (a != 0) {
            int r = (int)(a % 2); // remainder
            b = r + b; // concatenate remainder
            a /= 2; // reduce a
        }
        this.resultado = b;
        return b;
    }

    @Override
    public String getResultado() {
        return resultado;
    }
    
    
    
}
