import java.util.Scanner;
public class App10 {
    public static void main(String[] args) throws Exception {
        Pessoa2 pessoa = new Pessoa2(); 
        // instancia de um objeto do tipo de pessoa
        // esse objeto é independente dos demais

        Cliente2 cliente = new Cliente2();
        Fornecedor2 fornecedor = new Fornecedor2();

        Scanner leia = new Scanner(System.in);

        // agora vamos fazer o objeto pessoa

        System.out.println("\t\t\t **Bem vindo ao Programa** \n\n");
        System.out.println("Vamos Cadastrar uma pessoa!!");
        System.out.print("Digite um nome: ");
        pessoa.setNome(leia.next());
        System.out.print("Digite o Telefone: ");
        pessoa.setFone(leia.next());
        pessoa.print();

        System.out.println("*************************************");
        System.out.println("Agora vamos cadastrar o cliente");
        System.out.print("Digite o nome: ");
        cliente.setNome(leia.next());
        System.out.print("Digite o telefone: ");
        cliente.setFone(leia.next());
        System.out.print("Digite o valor da divida: ");
        cliente.setValorDivida(leia.nextFloat());
        cliente.print();


        System.out.println("*************************************");
        System.out.println("Agora vamos cadastrar o fornecedor");
        System.out.print("Digite o nome: ");
        fornecedor.setNome(leia.next());
        System.out.print("Digite o telefone: ");
        fornecedor.setFone(leia.next());
        System.out.print("Digite o valor da divida: ");
        fornecedor.setValorCompra(leia.nextFloat());
        fornecedor.print();


    }
}
