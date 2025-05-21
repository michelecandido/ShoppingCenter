import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaxLojas];
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public String toString() {
        return "Nome do Shopping: " + nome + "\n" + endereco +
               "Quantidade de Lojas: " + Arrays.toString(lojas);
    }
}