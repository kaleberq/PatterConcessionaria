
package ObserverVeiculo;

import ObserverVeiculo.Cliente;


public class ObservadorConcreto implements Cliente{

    @Override
    public void visualiza() {
        System.out.println("Visualizou");
    }
    
}
