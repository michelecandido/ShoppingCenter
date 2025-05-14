public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja (String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public String getNome () {
        return nome;
    }

    public int getQuantidadeFuncionarios () {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario () {
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco () {
        return endereco;
    }

    public Data getDataFundacao () {
        return dataFundacao;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios (int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario (double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco (Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataFundacao (Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String toString () {
        return "\n-- Informações da Loja --" + "\nNome da Loja: " + nome +
               "\nQuantidade de Funcionários: " + quantidadeFuncionarios +
               "\nSalário Base: R$" + String.format ("%.2f", salarioBaseFuncionario) +
               endereco + "\n" +dataFundacao;
    }

    public double gastosComSalario () {
        if (salarioBaseFuncionario > -1) {
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }
        else
            return -1;
    }

    public char tamanhoDaLoja () {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        }
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30)
            return 'M';
        else
            return 'G';
    }
}