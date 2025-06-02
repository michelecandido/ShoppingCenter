import java.util.Arrays;
import java.util.Objects;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public String toString() {
        return "\n-- Informações da Loja --" +
               "\nNome da Loja: " + nome +
               "\nQuantidade de Funcionários: " + quantidadeFuncionarios +
               "\nSalário Base: R$" + String.format("%.2f", salarioBaseFuncionario) +
               "\n" + endereco +
               "\nData de Fundação: " + dataFundacao +
               "\nEstoque: " + Arrays.toString(estoqueProdutos);
    }

    public double gastosComSalario() {
        if(salarioBaseFuncionario > -1) {
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }
        else
            return -1;
    }

    public char tamanhoDaLoja() {
        if(quantidadeFuncionarios < 10) {
            return 'P';
        }
        else if(quantidadeFuncionarios <= 30)
            return 'M';
        else
            return 'G';
    }

    public void imprimeProdutos() {
        for(int i = 0; i < estoqueProdutos.length; i++)
            if (estoqueProdutos[i] != null) {
                System.out.println(estoqueProdutos[i]);
        }
    }

    public boolean insereProduto(Produto produto) {
        for(int i = 0; i < estoqueProdutos.length; i++)
            if(estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
                }
        return false;
    }

    public boolean removeProduto(String nomeDoProduto) {
        for(int i = 0; i < estoqueProdutos.length; i++)
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeDoProduto)) {
                for(int x = i; x < estoqueProdutos.length - 1; x++) {
                    estoqueProdutos[x] = estoqueProdutos[x + 1];
                }
                estoqueProdutos[estoqueProdutos.length - 1] = null;
                return true;
            }
        return false;
    }
}