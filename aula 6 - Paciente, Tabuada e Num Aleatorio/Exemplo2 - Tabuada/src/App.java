import java.util.Scanner;
public class App {
 
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        numero = leia.nextInt();
        for(int cont = 0; cont <=10; cont++){
            System.out.println(numero+" x "+cont+" = "+numero*cont);
        }

        System.out.println("while: \n\n");
        int n = 1;
        while(n <=10){
            n = n*2;
            System.out.println(n);
        }
    }
}
