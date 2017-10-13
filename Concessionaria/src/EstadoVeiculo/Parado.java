
package EstadoVeiculo;


public class Parado implements Estado{
    
    @Override
    public void muitoUsado() {
        System.out.println("Vaza 2 litros de óleo por Hora e a bateria acaba rapido se não usar o carro");
    }

    @Override
    public void novo() {
        System.out.println("Fica sussa e não da dispessa e sujeira");
    }
}
