package atividade2;

/*
Ao executar o comando abaixo, instanciamos um "produto" com seus atributos vazios.
Entretanto, faz sentido um produto que não tem nome?
Faz sentido um produto que não tem preço?
Com o intuito de evitar a existência de produtos sem nome e sem preço, 
refaça o programa anterior com a inserçãodo construtor, 
tornando obrigatória a iniciação desses valores.

 */
public class Atividade2 {

    public static void main(String[] args) {

        Produto p = new Produto("", 20, 90);

        Produto cafe = new Produto("cafe", 0, 80);

        Produto p3 = new Produto("", 0, 90);

        Produto macarrao = new Produto("macarrao", 10, 90);

        

        System.out.println(macarrao.nome);
        System.out.println(macarrao.preco);
        System.out.println(macarrao.quantidade);

    }

}
