package atividade2;

class Produto {

    public String nome;
    protected int quantidade;
    protected double preco;

    public Produto(String nome, double preco, int quantidade) {
        if("".equals(nome) || preco == 0){
            System.out.println("nao existe esse produto sem nome ou preco");
        }
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double totalValorEmEstoque() {
        return quantidade * preco;
    }

    public void addProdutos(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade = this.quantidade - quantidade;

    }
}
