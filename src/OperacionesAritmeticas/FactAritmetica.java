/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionesAritmeticas;

import AbstractFactory.AbstractFactory;
import OperacionesAritmeticas.Operacion;



/**
 *
 * @author LN710Q
 */
public class FactAritmetica implements AbstractFactory{
    public Operacion CrearAritmetica(int a){
        switch(a){
            case 1:
                Operacion suma = new Suma();
                return suma;
            case 2:
                Operacion resta = new Resta();
                return resta;
            case 3:
                Operacion multiplicacion = new Multiplicacion();
                return multiplicacion;
            case 4:
                Operacion division = new Division();
                return division;           
        }
        return null;
        
    }

    @Override
    public Binario getBinario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
