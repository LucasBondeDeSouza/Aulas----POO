

public class Livro  extends Publicacao{
    private String editora;
    private String autores;


    public Livro(String titulo, String dataPublicacao, String editora, String autores) {
        super(titulo, dataPublicacao);
        this.editora = editora;
        this.autores = autores;
    }




    public String getEditora() {
        return editora;
    }






    public void setEditora(String editora) {
        this.editora = editora;
    }






    public String getAutores() {
        return autores;
    }






    public void setAutores(String autores) {
        this.autores = autores;
    }


    @Override
    public void imprimir() {
        System.out.println(" *********************************");
        System.out.println("\t\t\t ** Livro ** \n\n");
        System.out.println("titulo: "+getTitulo());
        System.out.println("Data publicacao"+ getDataPublicacao());
        System.out.println("Autores: "+getAutores());
        System.out.println("Editora: "+getEditora());
        System.out.println(" *********************************");
        
    }
    
}
