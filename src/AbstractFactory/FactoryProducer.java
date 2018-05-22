/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import FactoryBinario.FactBinario;
import OperacionesAritmeticas.FactAritmetica;

/**
 *
 * @author LN710Q
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "Binario":
                return   new FactBinario();
            case "Aritmetica":
                return  new FactAritmetica();
        }
        return null;
    }
}
