import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] nome = new String[10];
        float[] nota = new float[10];
        Scanner leia = new Scanner(System.in);

        // cadastrar      
        for(int i=0; i < nome.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome[i] = leia.next();
            System.out.print("Digite a nota: ");
            nota[i] = leia.nextFloat();

        }   
        float soma =0;
        //somatorio para a media
        for(int i = 0; i< nota.length; i++){
            soma = soma + nota[i];
        }
       
        float media = soma/nota.length;
        System.out.println("\n\n \t\t A media da turma é: "+media+"\n\n");

        // percorrer o vetor para achar as 
        // notas acima da media
        for(int i = 0; i<nota.length; i++){
            if(nota[i]>media){
                System.out.println("Parabéns!!"+nome[i]
                +", nota: "+nota[i]);
            }
        }

    }
}
