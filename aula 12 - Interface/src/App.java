import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Produto pd = new Produto();
        Usuario usuario = new Usuario();

        System.out.println("\t\t\t **Usuario** ");
        System.out.println("Digite o nome:");
        usuario.setNomecompleto(sc.next());
        System.out.println("Digite a idade:");
        usuario.setIdade(sc.nextInt());
        System.out.println("Digite o usuario:");
        usuario.setNomeusuario(sc.next());
        System.out.println("Digite a senha:");
        usuario.setSenha(sc.next());

        System.out.println(usuario.formatoString());
        usuario.formatoSystemOut();

        

    }
}
