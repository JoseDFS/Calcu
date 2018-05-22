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

    @Override
    public String aBinario(int a) {
        String convert = null;
        String sCadenaInvertida = null;
        while(a>=2){
            convert += a%2;
        }
        for (int x=convert.length()-1;x>=0;x--)
		sCadenaInvertida = sCadenaInvertida + convert.charAt(x);
        
        return sCadenaInvertida;
    }
    
}
