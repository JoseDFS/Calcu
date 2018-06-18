/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryBinario;

import AbstractFactory.AbstractFactory;
import Binario.Conversion;
import OperacionesAritmeticas.Operacion;

/**
 *
 * @author LN710Q
 */
public class FactBinario implements AbstractFactory {
   

    @Override
    public Binario getBinario() {
        
        return new Conversion();
    }

  

    @Override
    public Operacion getOperacion(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
