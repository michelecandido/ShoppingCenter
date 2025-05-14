public class Produto {
    private String nome;
    private double preco;
    private Data dataDeValidade;

    public Produto (String nome, double preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    public String getNome () {
        return nome;
    }

    public double getPreco () {
        return preco;
    }

    public Data getDataDeValidade () {
        return dataDeValidade;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setPreco (double preco) {
        this.preco = preco;
    }

    public void setDataDeValidade (Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public String toString () {
        return "Nome do Produto: " + nome +
                "\nPreço: R$" + String.format ("%.2f", preco);
    }

    public boolean estaVencido (Data data) {
        if (dataDeValidade.getAno() < data.getAno()) {
            return true;
        }
        else if (dataDeValidade.getAno() == data.getAno())
            if (dataDeValidade.getMes() < data.getMes()) {
                return true;
            }
            else if (dataDeValidade.getMes() == data.getMes())
                return dataDeValidade.getDia() <= data.getDia();
        return false;
    }
}