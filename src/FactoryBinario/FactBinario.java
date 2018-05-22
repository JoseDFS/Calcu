/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryBinario;

import AbstractFactory.AbstractFactory;
import Binario.Conversion;

/**
 *
 * @author LN710Q
 */
public class FactBinario implements AbstractFactory {
    public  Binario CrearBinario(int a){
        Binario binario = new Conversion();
        return binario;
    }

    @Override
    public Binario getBinario() {
        return null;
    }
    
}
