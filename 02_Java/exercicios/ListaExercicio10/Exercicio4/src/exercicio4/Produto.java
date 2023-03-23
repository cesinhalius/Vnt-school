package exercicio4;

class Produto {

    protected int codigo;
    protected String Produto;
    protected double preco;

    double conta(int c) {
        double compra = 0;
        switch (c) {
            case 1:
                compra = compra + 7.00;
                break;
            case 2:
                compra += 9.00;
                break;
            case 3:
                compra += 11.00;
                break;
            case 4:
                compra += 5.00;
            case 5:
                compra += 4.00;
            default:
                break;
        }
        return compra;

    }

}

