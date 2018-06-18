/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import FactoryBinario.Binario;
import OperacionesAritmeticas.Operacion;

/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Binario getBinario();
    Operacion getOperacion(int a);
}
