/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1;

/**
 *
 * @author Cesar Roberto
 */
class Produto {

    public String nome;
    protected int quantidade;
    protected double preco;

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
