import javax.swing.JOptionPane;
import java.util.Scanner;


public class App2 {
    public static void main(String[] args) throws Exception {
        int idade, num, teste;
        double salario, altura;
        float peso;
        char letra, digito;
        long numero_grande;
        short numero_curto;
        byte pequeno;
        boolean resposta;
        String nome;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu Peso: ");
        peso = sc.nextFloat();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Você é uma pessoa? ");
        resposta = sc.nextBoolean();
        JOptionPane.showMessageDialog(null, 
        " Seu Nome é" +nome+"\n Seu peso "+peso+
        "\n sua idade "+idade+" \n Você é humano? "+
        resposta+"\n **");
    } 
}
