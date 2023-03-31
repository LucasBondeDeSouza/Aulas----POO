public class App {
    public static void main(String[] args) throws Exception {
       String[] vetor1, vetor2;
       vetor1 = new String[2];
       vetor2 = new String[5];

       float[] vetor3 = new float[3];

       int[] vetor4 = {1,2,3,4};
       
       // acessar os elementos do vetor
       vetor1[0]="Juliana";
       // atrinui o texto juliana 
       // na posição 0 do vetor1
       vetor1[1] = "Pedro";

       // 
       int[] lista = new int[10];
       int[] numeros = {1,2,3};
       
       

       System.out.println("O tamanho da lista é: "+
       lista.length);

       System.out.println("O tamanho de numeros é: "+
       numeros.length);
    }
}
