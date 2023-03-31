import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno[] = new Aluno[10];
        Scanner entrada = new Scanner(System.in);
        
        // quando cria vetor de objetos todas 
        // os elementos são nulos
        for(int i =0; i<aluno.length; i++ ){
            System.out.println(aluno[i]);
        }

        Aluno a = new Aluno();
        System.out.print("Digite o nome: ");
        a.setNome(entrada.next());
        System.out.print("Digite o RGM: ");
        a.setRgm(entrada.next());
        System.out.print("Digite a idade: ");
        a.setIdade(entrada.nextInt());

        aluno[0] = a;

        for(int i =0; i<aluno.length; i++ ){
            if(aluno[i] != null){
                System.out.println(aluno[i].getNome());
            }
        }

    }
}
