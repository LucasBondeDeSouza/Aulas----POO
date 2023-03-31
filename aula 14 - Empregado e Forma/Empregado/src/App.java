import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Analista analista = new Analista();
        Programador prog = new Programador();
        Scanner leia = new Scanner(System.in);

        prog.setNome("Lalalala");
        prog.setMatricula("12394-vz");
        prog.setQtdeHoras(500);
        prog.setValorHora(40.50f);

        System.out.println("nome: "+prog.getNome()+"\n"
            +"matricula: "+prog.getMatricula()+"\n"
            +"Horas: "+prog.getQtdeHoras()+"\n"
            +"valor: "+prog.getValorHora()+"\n"
            +"Salario: "+prog.calculaSalario());

        analista.setMatricula("4586321");
        analista.setNome("Lero lero");
        int qtd;
        do{
            System.out.print("Digite a quantidade de projetos: ");
             qtd= leia.nextInt();
        }while(qtd <=0);    
        float[] projeto = new float[qtd];
        
        for(int i = 0; i< qtd; i++){
            System.out.print("Digite o valor do projeto "+(i+1)+": ");
            projeto[i] = leia.nextFloat();
        }

        analista.setValorPorProjeto(projeto);


        System.out.println("nome: "+analista.getNome()
            +"\nmatricula: "+analista.getMatricula()
            +"\nSalario: "+analista.calculaSalario());
        

    }
}
