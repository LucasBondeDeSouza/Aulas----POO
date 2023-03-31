public class Produto implements Imprimivel, Seguranca{
    private String descricao;
    private int quantidade;

    
    public Produto() {
    }


    public Produto(String descricao, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public boolean validar() {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public String formatoString() {
        String texto = "-- Descricao: "+getDescricao()+nlin
        +"-- Quantidade: "+getQuantidade();
        return texto;
    }


    @Override
    public void formatoSystemOut() {
        System.out.println(nlin+"********************************"+nlin);
        System.out.println("descricao: "+getDescricao());
        System.out.println("quantidade: "+getQuantidade());
        System.out.println("********************************"+nlin);
        
    }

    
    

    
}
