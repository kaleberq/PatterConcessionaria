
package StrategyVeiculo;

import StrategyVeiculo.FormaMovimento;


public class Voar implements FormaMovimento{

    @Override
    public void movimento() {
        System.out.println("Voando");
    }
    
}
