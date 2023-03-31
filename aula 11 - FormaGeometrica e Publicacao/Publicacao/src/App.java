public class App {
    public static void main(String[] args) throws Exception {
        
        Livro livro = new Livro(null, null, null, null);

        Revista revista = new Revista(null, null, null, null);

        livro.imprimir();

        revista.imprimir();
      
    }
}
