package exercicio2;

class ProdutoUsado extends Produto{

    private String dataFabricacao;
    
    public ProdutoUsado(String nome, double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }
    
    @Override
    public void etiquetaPreco(){
        System.out.printf("%s (Usado) R$ %.2f (Data de fabricacao: %s) %n", getNome(),getPreco(),dataFabricacao);
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    

}
