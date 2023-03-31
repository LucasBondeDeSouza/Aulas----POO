import java.util.Scanner;
public class App6 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int anoAtual, retorno;
        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente(" ");
        
        System.out.println("\t\t\t*** Bem vindo ao SisMed *** \n");
        System.out.print("Digite o ano atual: ");
        anoAtual = leia.nextInt();
        
        System.out.println("Cadastro dos dados do primeiro objeto: ");
        p1.cadastraDados();
        p1.imprimeDados();
        retorno = p1.calculaIdade(anoAtual);
        if(retorno > 0)
            System.out.println("A idade de "+p1.nome+" é: "+retorno);
        else
           System.out.println("Data de nascimento maior que o ano atual");  

        System.out.println("Cadastro dos dados do segundo objeto: ");
        p2.cadastraDados();
        p2.imprimeDados();
        retorno = p2.calculaIdade(anoAtual);
        if(retorno > 0)
            System.out.println("A idade de "+p2.nome+" é: "+retorno);
        else
            System.out.println("Data de nascimento maior que o ano atual");  
        leia.close();

    }
}
