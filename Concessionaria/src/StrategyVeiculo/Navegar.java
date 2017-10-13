
package StrategyVeiculo;

import StrategyVeiculo.FormaMovimento;


public class Navegar implements FormaMovimento{

    @Override
    public void movimento() {
        System.out.println("Navegando");
    }
    
}
