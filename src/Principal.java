public class Principal {
    public static void menu() {
        System.out.println("-- Escolha uma opção do menu abaixo:\n");
        System.out.println("(1) Criar uma loja");
        System.out.println("(2) Criar um produto");
        System.out.println("(3) Sair\n");
    }

    public static void main(String[] args) {
        while(true) {
            menu();
            int opcao = Teclado.leInt("Opção: ");

            if(opcao == 1) {
                System.out.println("\n-- Criação de Loja --");

                Loja loja = new Loja(Teclado.leString("Nome da loja: "),
                        Teclado.leInt("Quantidade de funcionários: "),
                        Teclado.leDouble("Salário base: "),
                        new Endereco(Teclado.leString("\n-- Endereço --\nRua: "),
                                Teclado.leString("Cidade: "),
                                Teclado.leString("Estado: "),
                                Teclado.leString("País: "),
                                Teclado.leString("CEP: "),
                                Teclado.leString("Número: "),
                                Teclado.leString("Complemento: ")),
                        new Data(Teclado.leInt("\n-- Data de fundação --\nDia: "),
                                Teclado.leInt("Mês: "),
                                Teclado.leInt("Ano: ")));

                System.out.println(loja);
            }
            else if(opcao == 2) {
                System.out.println("\n-- Criação de Produto --");

                Produto produto = new Produto(Teclado.leString("Nome do produto: "),
                        Teclado.leDouble("Preço: "),
                        new Data(Teclado.leInt("\n-- Validade --\nDia: "),
                                Teclado.leInt("Mês: "),
                                Teclado.leInt("Ano: ")));

                Data dataAtual = new Data(Teclado.leInt("\n-- Verificação de Validade --\n" +
                        "Que dia é hoje?\nDia: "),
                        Teclado.leInt("Mês: "),
                        Teclado.leInt("Ano: "));

                if(produto.estaVencido(dataAtual)) {
                    System.out.println("\nPRODUTO VENCIDO\n");
                }
                else
                    System.out.println("\nPRODUTO NÃO VENCIDO");
            }
            else if(opcao == 3) {
                System.out.println("\nJá vai? Te vejo na próxima! :)");
                break;
            }
            else
                System.out.println("Opção inválida! Tente novamente.\n");
        }
    }
}