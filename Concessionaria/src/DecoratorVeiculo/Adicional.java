
package DecoratorVeiculo;


public abstract class Adicional extends Peca{
    
    protected Peca peca;
    protected String descricao;
    protected Double preco;

    public Adicional(Peca peca, String descricao, Double preco) {
        this.peca = peca;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    @Override
    public String getDescricao() {
        return descricao+", "+peca.getDescricao();
    }
    
    @Override
    public Double getPreco() {
        return preco+peca.getPreco();
    }

    
   
}
