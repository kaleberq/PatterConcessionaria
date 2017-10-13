
package concessionaria;

import ObserverVeiculo.ObservadorConcreto;
import DecoratorVeiculo.Adicional;
import DecoratorVeiculo.ArCondicionado;
import DecoratorVeiculo.Peca;
import DecoratorVeiculo.RodasLigaLeve;
import EstadoVeiculo.Andando;
import EstadoVeiculo.Parado;
import StrategyVeiculo.Voar;


public class Concessionaria {

    
    public static void main(String[] args) {
        
        //Observer
        Carro c = new Carro();
        c.addVisualizadores(new ObservadorConcreto());
        c.setNome("Kalebe");
        System.out.println("");
        //Decorator
        Peca a = new Carro();
        a = new ArCondicionado(a);
        a = new RodasLigaLeve(a);
        System.out.println("O seu produto é:" + a.getDescricao());
        System.out.println("Voce deve pagar:" + a.getPreco());
        System.out.println("");
        //State
        Carro e = new Carro();
        e.setEstado(new Andando());
        e.novo();
        e.usado();
        e.setEstado(new Parado());
        e.novo();
        e.usado();
        System.out.println("");
        //Strategy
        Carro v = new Carro();
        v.setFormaMovimento(new Voar());
        v.movimentar();
        
        
        
        
    }
    
}
