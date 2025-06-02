import java.util.Scanner;

public class Principal {
    public static void menu() {
        System.out.println("-- Escolha uma opção do menu abaixo:\n");
        System.out.println("(1) Criar uma loja");
        System.out.println("(2) Criar um produto");
        System.out.println("(3) Sair\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            menu();
            System.out.print("Opção: ");
            int opcao = input.nextInt();

            if(opcao == 1) {
                System.out.println("\n-- Criação de Loja --");

                System.out.print("Nome da Loja: ");
                String nomeLoja = input.nextLine();

                System.out.print("Quantidade de Funcionários: ");
                int quantFuncionarios = input.nextInt();
                input.nextLine();

                System.out.print("Salário Base: ");
                double salarioBase = input.nextDouble();
                input.nextLine();

                System.out.println("\n-- Endereço --");

                System.out.print("Rua: ");
                String ruaLoja = input.nextLine();

                System.out.print("Cidade: ");
                String cidadeLoja = input.nextLine();

                System.out.print("Estado: ");
                String estadoLoja = input.nextLine();

                System.out.print("País: ");
                String paisLoja = input.nextLine();

                System.out.print("CEP: ");
                String cepLoja = input.nextLine();

                System.out.print("Número: ");
                String numLoja = input.nextLine();

                System.out.print("Complemento: ");
                String complementoLoja = input.nextLine();

                System.out.println("\n-- Data de Fundação --");

                System.out.print("Dia: ");
                int diaLoja = input.nextInt();

                System.out.print("Mês: ");
                int mesLoja = input.nextInt();

                System.out.print("Ano: ");
                int anoLoja = input.nextInt();

                System.out.print("Espaço Disponível no Estoque: ");
                int estoqueLoja = input.nextInt();

                Loja loja = new Loja(nomeLoja, quantFuncionarios, salarioBase,
                        new Endereco(ruaLoja, cidadeLoja, estadoLoja, paisLoja, cepLoja, numLoja, complementoLoja),
                        new Data(diaLoja, mesLoja, anoLoja),
                        estoqueLoja);

                System.out.println(loja);
            }
            else if(opcao == 2) {
                System.out.println("\n-- Criação de Produto --");
                /*
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
                    System.out.println("\nPRODUTO NÃO VENCIDO\n");

                 */
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