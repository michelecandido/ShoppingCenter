import java.util.Arrays;
import java.util.Objects;

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
        return "-- Informações do Shopping --\n" +
               "Nome do Shopping: " + nome + "\n" +
               "Quantidade de Lojas: " + Arrays.toString(lojas) +
               "\n" + endereco.toString();
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeDaLoja) {
        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeDaLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoDeLoja) {
        int quantidadeLojas = 0;

        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] != null)
                switch(tipoDeLoja) {
                    case("Cosmético"):
                        if(lojas[i] instanceof Cosmetico)
                            quantidadeLojas++;
                        break;
                    case("Vestuário"):
                        if(lojas[i] instanceof Vestuario)
                            quantidadeLojas++;
                        break;
                    case("Bijuteria"):
                        if(lojas[i] instanceof Bijuteria)
                            quantidadeLojas++;
                        break;
                    case("Alimentação"):
                        if(lojas[i] instanceof Alimentacao)
                            quantidadeLojas++;
                        break;
                    case("Informática"):
                        if(lojas[i] instanceof Informatica)
                            quantidadeLojas++;
                        break;
                    default:
                        return -1;
                }
        }
        return quantidadeLojas;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double seguroMaisCaro = 0;

        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] instanceof Informatica && ((Informatica) lojas[i]).getSeguroEletronicos() > seguroMaisCaro) {
                seguroMaisCaro =  ((Informatica) lojas[i]).getSeguroEletronicos();
                lojaMaisCara = (Informatica) lojas[i];
            }
        }
        return lojaMaisCara;
    }
}