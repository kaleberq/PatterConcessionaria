
package EstadoVeiculo;


public class Andando implements Estado{

    @Override
    public void muitoUsado() {
        System.out.println("Faz 2 kilometros com um litro");
    }

    @Override
    public void novo() {
        System.out.println("Faz 20 kilometros com um litro");
    }
    
}
