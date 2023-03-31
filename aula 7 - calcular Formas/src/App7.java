import java.util.Scanner;

public class App7 {
    public static void main(String[] args) throws Exception {

        int opcao;
        Scanner leia = new Scanner(System.in);
        double v1, v2;
        char resposta = 'S';
        // onde vamos precisar repetir
        while (resposta == 'S') {
            
            System.out.println("\t\t\t ** Bem-vindo ao Programa ** \n\n");
            System.out.println("1 - Triangulo \n"
                                +"2 - Retangulo \n"
                                +"3 - Quadrado \n"
                                +"4 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n****************************\n");
                    System.out.println("\t\t\t ** Calculo Triangulo \n");
                    System.out.print("Digite a base do triangulo: ");
                    v1 = leia.nextDouble();
                    System.out.print("Digite a altura do triangulo");
                    v2 = leia.nextDouble();
                    Triangulo2 triangulo = new Triangulo2(v1,v2);
                    System.out.println("A area do triangulo é: "+ 
                    triangulo.calcArea());
                    System.out.println("****************************\n");
                    break;
                case 2:
                    System.out.println("\n****************************\n");
                    System.out.println("\t\t\t ** Calculo Retangulo \n");
                    System.out.print("Digite a base do retangulo: ");
                    v1 = leia.nextDouble();
                    System.out.print("Digite a altura do retangulo:");
                    v2 = leia.nextDouble();
                    Retangulo2 retangulo = new Retangulo2(v1,v2);
                    System.out.println("A area do retantulo é: "+ 
                    retangulo.calcArea());
                    System.out.println("O perimetro do retantulo é: "+ 
                    retangulo.calcPerimetro());
                    System.out.println("\n****************************\n");
                    break;
                
                case 3:
                    
                    System.out.println("\n****************************\n");
                    System.out.println("\t\t\t ** Calculo Quadrado\n");
                    System.out.print("Digite o lado do quadrado: ");
                    v1 = leia.nextDouble();
                    Quadrado2 quadrado = new Quadrado2(v1);
                    System.out.println("A area do quadrado é: "+ 
                    quadrado.calcArea());
                    System.out.println("O perimetro do quadrado é: "+ 
                    quadrado.calcPerimetro());
                    System.out.println("\n****************************\n");
                    break;
                
                case 4:
                    
                    do{ 
                        System.out.println("\n****************************\n");
                        System.out.println("Deseja continuar a executar o programa (S/N)");
                        resposta = leia.next().toUpperCase().charAt(0);
                        System.out.println("\n****************************\n");
                    }while(resposta != 'S' && resposta != 'N');
                   
                    break;
                
                default:
                    System.out.println("\n****************************\n");
                    System.out.println("OPÇÃO INVALIDA!!!");
                    System.out.println("Tente novamente");
                    System.out.println("\n****************************\n");
                    break;
            }
        }

    }
}
