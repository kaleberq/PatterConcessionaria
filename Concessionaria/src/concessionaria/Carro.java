
package concessionaria;

import ObserverVeiculo.Cliente;

import java.util.ArrayList;
import java.util.List;
import DecoratorVeiculo.Peca;
import EstadoVeiculo.Estado;
import StrategyVeiculo.FormaMovimento;

public class Carro extends Peca{
    
    //ClienteObserver
    private List <Cliente> clientes = new ArrayList<>();
    
    private String nome;
    
    public void setNome(String nome) {
        this.nome = nome;
        visualizaTodos();
    }
    
    private void visualizaTodos(){
        for (Cliente o: clientes){
        o.visualiza();
        }
    }
   

    public void addVisualizadores(Cliente novoCliente){
        this.clientes.add(novoCliente);
    }
    //DecoratorVeiculo
     @Override
    public String getDescricao() {
        return "Gol";
    }

    @Override
    public Double getPreco() {
        return 200.00;
    }
    //EstadoVeiculo
    private Estado estado;
    
    public void setEstado(Estado estado) {
        this.estado = estado;
        
    }
    
    public void novo(){
        estado.novo();
    }
    public void usado(){
        estado.muitoUsado();
    }
    //StrategyVeiculo
    private FormaMovimento formaMovimento; 
   
    public void setFormaMovimento(FormaMovimento formaMovimento) {
        this.formaMovimento = formaMovimento;
    }
      
    
    public void movimentar(){
        formaMovimento.movimento();
    } 
    
}
