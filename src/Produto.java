public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String toString() {
        return "Nome do Produto: " + nome +
                "\nPreço: R$" + String.format("%.2f", preco);
    }

    public boolean estaVencido(Data data) {
        if (dataValidade.getAno() < data.getAno()) {
            return true;
        }
        else if (dataValidade.getAno() == data.getAno())
            if (dataValidade.getMes() < data.getMes()) {
                return true;
            }
            else if (dataValidade.getMes() == data.getMes())
                return dataValidade.getDia() <= data.getDia();
        return false;
    }
}