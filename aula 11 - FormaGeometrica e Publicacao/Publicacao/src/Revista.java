public class Revista extends Publicacao{
    private String editor;
    private String local;

    

    public Revista(String titulo, String dataPublicacao, String editor, String local) {
        super(titulo, dataPublicacao);
        this.editor = editor;
        this.local = local;
    }



    public String getEditor() {
        return editor;
    }



    public void setEditor(String editor) {
        this.editor = editor;
    }



    public String getLocal() {
        return local;
    }



    public void setLocal(String local) {
        this.local = local;
    }



    @Override
    public void imprimir() {
        System.out.println(" *********************************");
        System.out.println("\t\t\t ** Revista ** \n\n");
        System.out.println("titulo: "+getTitulo());
        System.out.println("Data publicacao"+ getDataPublicacao());
        System.out.println("Editor: "+ getEditor());
        System.out.println("Local"+getLocal());
        System.out.println(" *********************************");
        
    }

    public void leitura(){
        System.out.println("Só para não dizer que não tem código aqui");

    }

    

    
}
